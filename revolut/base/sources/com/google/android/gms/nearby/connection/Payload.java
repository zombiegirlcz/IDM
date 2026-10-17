package com.google.android.gms.nearby.connection;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.nearby.zzts;
import com.google.android.gms.internal.nearby.zzua;
import j6.a;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public class Payload {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzua f47826zza = zzua.zzn("/", "\\", "../");

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzua f47827zzb = zzua.zzq("../", "/", "\\", "?", "*", "\"", "<", ">", "|", ":", "\u0000", "\n", "\r", "\t", "\f");

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzua f47828zzc = zzua.zzo("..", ".", "\\", "/");

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final zzua f47829zzd = zzua.zzl("\\");

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final zzua f47830zze = zzua.zzm("../", "..\\");

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzua f47831zzf = zzua.zzq("?", "*", "\"", "|", ":", "\u0000", "\n", "\r", "\t", "\f", "../", "..", new String[0]);

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    public static final zzua f47832zzg = zzua.zzl("\\");

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    public static final zzua f47833zzh = zzua.zzm("\\", "/");

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final long f47834zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @Type
    private final int f47835zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final byte[] f47836zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final File f47837zzl;
    private final Stream zzm;
    private long zzn;
    private boolean zzo;
    private String zzp;
    private String zzq;

    public static class File {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final java.io.File f47838zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final ParcelFileDescriptor f47839zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private final long f47840zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private final Uri f47841zzd;

        private File(java.io.File file, ParcelFileDescriptor parcelFileDescriptor, long j2, Uri uri2) {
            this.f47838zza = file;
            this.f47839zzb = parcelFileDescriptor;
            this.f47840zzc = j2;
            this.f47841zzd = uri2;
        }

        @NonNull
        public static File zza(@NonNull java.io.File file, @NonNull ParcelFileDescriptor parcelFileDescriptor, long j2, @NonNull Uri uri2) {
            return new File((java.io.File) Preconditions.checkNotNull(file, "Cannot create Payload.File from null java.io.File."), (ParcelFileDescriptor) Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), j2, (Uri) Preconditions.checkNotNull(uri2, "Cannot create Payload.File from null Uri"));
        }

        @NonNull
        public static File zzb(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new File(null, (ParcelFileDescriptor) Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), parcelFileDescriptor.getStatSize(), null);
        }

        @Deprecated
        public java.io.File asJavaFile() {
            return this.f47838zza;
        }

        @NonNull
        public ParcelFileDescriptor asParcelFileDescriptor() {
            return this.f47839zzb;
        }

        public Uri asUri() {
            return this.f47841zzd;
        }

        @Deprecated
        public void close() {
            IOUtils.closeQuietly(this.f47839zzb);
        }

        public long getSize() {
            return this.f47840zzc;
        }
    }

    public static class Stream {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final ParcelFileDescriptor f47842zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private InputStream f47843zzb;

        private Stream(ParcelFileDescriptor parcelFileDescriptor, InputStream inputStream) {
            this.f47842zza = parcelFileDescriptor;
            this.f47843zzb = inputStream;
        }

        @NonNull
        public static Stream zza(@NonNull InputStream inputStream) {
            Preconditions.checkNotNull(inputStream, "Cannot create Payload.Stream from null InputStream.");
            return new Stream(null, inputStream);
        }

        @NonNull
        public static Stream zzb(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.Stream from null ParcelFileDescriptor.");
            return new Stream(parcelFileDescriptor, null);
        }

        @NonNull
        public InputStream asInputStream() {
            if (this.f47843zzb == null) {
                this.f47843zzb = new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) Preconditions.checkNotNull(this.f47842zza));
            }
            return this.f47843zzb;
        }

        public ParcelFileDescriptor asParcelFileDescriptor() {
            return this.f47842zza;
        }

        @Deprecated
        public void close() {
            IOUtils.closeQuietly(this.f47842zza);
            IOUtils.closeQuietly(this.f47843zzb);
        }
    }

    public @interface Type {
        public static final int BYTES = 1;
        public static final int FILE = 2;
        public static final int STREAM = 3;
    }

    private Payload(long j2, int i, byte[] bArr, File file, Stream stream) {
        this.f47834zzi = j2;
        this.f47835zzj = i;
        this.f47836zzk = bArr;
        this.f47837zzl = file;
        this.zzm = stream;
    }

    @NonNull
    public static Payload fromBytes(@NonNull byte[] bArr) {
        Preconditions.checkNotNull(bArr, "Cannot create a Payload from null bytes.");
        return zza(bArr, UUID.randomUUID().getLeastSignificantBits());
    }

    @NonNull
    public static Payload fromFile(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        return zzb(File.zzb(parcelFileDescriptor), UUID.randomUUID().getLeastSignificantBits());
    }

    @NonNull
    public static Payload fromStream(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        return zzc(Stream.zzb(parcelFileDescriptor), UUID.randomUUID().getLeastSignificantBits());
    }

    @NonNull
    public static Payload zza(@NonNull byte[] bArr, long j2) {
        return new Payload(j2, 1, bArr, null, null);
    }

    @NonNull
    public static Payload zzb(@NonNull File file, long j2) {
        return new Payload(j2, 2, null, file, null);
    }

    @NonNull
    public static Payload zzc(@NonNull Stream stream, long j2) {
        return new Payload(j2, 3, null, null, stream);
    }

    public byte[] asBytes() {
        return this.f47836zzk;
    }

    public File asFile() {
        return this.f47837zzl;
    }

    public Stream asStream() {
        return this.zzm;
    }

    public void close() {
        File file = this.f47837zzl;
        if (file != null) {
            file.close();
        }
        Stream stream = this.zzm;
        if (stream != null) {
            stream.close();
        }
    }

    public long getId() {
        return this.f47834zzi;
    }

    public long getOffset() {
        return this.zzn;
    }

    @Type
    public int getType() {
        return this.f47835zzj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setFileName(@NonNull String str) {
        if (zzts.zzb(str)) {
            throw new IllegalArgumentException("Payload file name should not be null or empty.");
        }
        if (getType() != 2) {
            throw new IllegalArgumentException("Payload type must be FILE.");
        }
        zzua zzuaVar = f47826zza;
        int size = zzuaVar.size();
        int i = 0;
        while (i < size) {
            String str2 = (String) zzuaVar.get(i);
            i++;
            if (str.contains(str2)) {
                throw new IllegalArgumentException(a.s("File name ", str, " contains illegal string ", str2, "."));
            }
        }
        this.zzp = str;
    }

    public void setOffset(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("Payload offset must be positive or zero.");
        }
        if (getType() != 2 && getType() != 3) {
            throw new IllegalArgumentException("Payload offset only support FILE or STREAM type.");
        }
        File file = this.f47837zzl;
        if (file != null && j2 >= file.getSize()) {
            throw new IllegalArgumentException("Payload offset should be smaller than the file size.");
        }
        getType();
        this.zzn = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setParentFolder(@NonNull String str) {
        if (zzts.zzb(str)) {
            throw new IllegalArgumentException("Payload parent folder should not be null or empty.");
        }
        if (getType() != 2) {
            throw new IllegalArgumentException("Payload type must be FILE.");
        }
        zzua zzuaVar = f47830zze;
        int size = zzuaVar.size();
        int i = 0;
        while (i < size) {
            boolean zContains = str.contains((String) zzuaVar.get(i));
            i++;
            if (zContains) {
                throw new IllegalArgumentException("Folder name contains illegal string.");
            }
        }
        this.zzq = str;
    }

    public void setSensitive(boolean z) {
        this.zzo = z;
    }

    @ShowFirstParty
    public final String zzd() {
        return this.zzp;
    }

    @ShowFirstParty
    public final String zze() {
        return this.zzq;
    }

    public final boolean zzf() {
        return this.zzo;
    }

    @NonNull
    public static Payload fromFile(@NonNull java.io.File file) throws FileNotFoundException {
        return zzb(File.zza(file, ParcelFileDescriptor.open(file, 268435456), file.length(), Uri.fromFile(file)), UUID.randomUUID().getLeastSignificantBits());
    }

    @NonNull
    public static Payload fromStream(@NonNull InputStream inputStream) {
        return zzc(Stream.zza(inputStream), UUID.randomUUID().getLeastSignificantBits());
    }
}
