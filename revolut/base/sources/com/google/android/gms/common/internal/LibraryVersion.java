package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.IOUtils;
import com.revolut.ProtectedRevolutApplication;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@Deprecated
public class LibraryVersion {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final GmsLogger f38075zza = new GmsLogger("LibraryVersion", "");

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final LibraryVersion f38076zzb = new LibraryVersion();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final ConcurrentHashMap f38077zzc = new ConcurrentHashMap();

    @NonNull
    @KeepForSdk
    public static LibraryVersion getInstance() {
        return f38076zzb;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public String getVersion(@NonNull String str) throws Throwable {
        IOException e;
        String str2;
        InputStream inputStreamA;
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f38077zzc;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                inputStreamA = ProtectedRevolutApplication.a(LibraryVersion.class, "/" + str + ".properties");
            } catch (IOException e2) {
                e = e2;
                str2 = null;
            }
        } catch (Throwable th10) {
            th = th10;
        }
        try {
            if (inputStreamA != null) {
                properties.load(inputStreamA);
                property = properties.getProperty("version", null);
                GmsLogger gmsLogger = f38075zza;
                StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                sb6.append(str);
                sb6.append(" version is ");
                sb6.append(property);
                gmsLogger.v("LibraryVersion", sb6.toString());
            } else {
                GmsLogger gmsLogger2 = f38075zza;
                StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 43);
                sb9.append("Failed to get app version for libraryName: ");
                sb9.append(str);
                gmsLogger2.w("LibraryVersion", sb9.toString());
            }
        } catch (IOException e4) {
            e = e4;
            String str3 = property;
            inputStream = inputStreamA;
            str2 = str3;
            GmsLogger gmsLogger3 = f38075zza;
            StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 43);
            sb10.append("Failed to get app version for libraryName: ");
            sb10.append(str);
            gmsLogger3.e("LibraryVersion", sb10.toString(), e);
            InputStream inputStream2 = inputStream;
            property = str2;
            inputStreamA = inputStream2;
        } catch (Throwable th11) {
            th = th11;
            inputStream = inputStreamA;
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
            }
            throw th;
        }
        if (inputStreamA != null) {
            IOUtils.closeQuietly(inputStreamA);
        }
        if (property == null) {
            f38075zza.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            property = "UNKNOWN";
        }
        this.f38077zzc.put(str, property);
        return property;
    }
}
