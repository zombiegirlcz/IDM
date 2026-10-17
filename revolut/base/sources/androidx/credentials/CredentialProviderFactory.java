package androidx.credentials;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\bJ'\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR.\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00068G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010#R.\u0010$\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00068G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\b\"\u0004\b&\u0010#¨\u0006("}, d2 = {"Landroidx/credentials/CredentialProviderFactory;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/credentials/CredentialProvider;", "tryCreatePreUOemProvider", "()Landroidx/credentials/CredentialProvider;", "tryCreatePostUProvider", "", "", "classNames", "instantiatePreUProvider", "(Ljava/util/List;Landroid/content/Context;)Landroidx/credentials/CredentialProvider;", "getAllowedProvidersFromManifest", "(Landroid/content/Context;)Ljava/util/List;", "", "shouldFallbackToPreU", "getBestAvailableProvider", "(Z)Landroidx/credentials/CredentialProvider;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<set-?>", "testMode", "Z", "getTestMode", "()Z", "setTestMode", "(Z)V", "testPostUProvider", "Landroidx/credentials/CredentialProvider;", "getTestPostUProvider", "setTestPostUProvider", "(Landroidx/credentials/CredentialProvider;)V", "testPreUProvider", "getTestPreUProvider", "setTestPreUProvider", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CredentialProviderFactory {

    @NotNull
    private final Context context;
    private boolean testMode;
    private CredentialProvider testPostUProvider;
    private CredentialProvider testPreUProvider;

    public CredentialProviderFactory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final List<String> getAllowedProvidersFromManifest(Context context) throws PackageManager.NameNotFoundException {
        String string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            Intrinsics.checkNotNullExpressionValue(serviceInfoArr, "packageInfo.services");
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        return d0.d1(arrayList);
    }

    public static /* synthetic */ CredentialProvider getBestAvailableProvider$default(CredentialProviderFactory credentialProviderFactory, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = true;
        }
        return credentialProviderFactory.getBestAvailableProvider(z);
    }

    private final CredentialProvider instantiatePreUProvider(List<String> classNames, Context context) {
        Iterator<String> it8 = classNames.iterator();
        CredentialProvider credentialProvider = null;
        while (it8.hasNext()) {
            try {
                Object objNewInstance = Class.forName(it8.next()).getConstructor(Context.class).newInstance(context);
                Intrinsics.i(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                CredentialProvider credentialProvider2 = (CredentialProvider) objNewInstance;
                if (!credentialProvider2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (credentialProvider != null) {
                        return null;
                    }
                    credentialProvider = credentialProvider2;
                }
            } catch (Throwable unused) {
            }
        }
        return credentialProvider;
    }

    private final CredentialProvider tryCreatePostUProvider() {
        if (!this.testMode) {
            CredentialProviderFrameworkImpl credentialProviderFrameworkImpl = new CredentialProviderFrameworkImpl(this.context);
            if (credentialProviderFrameworkImpl.isAvailableOnDevice()) {
                return credentialProviderFrameworkImpl;
            }
            return null;
        }
        CredentialProvider credentialProvider = this.testPostUProvider;
        if (credentialProvider != null && credentialProvider.isAvailableOnDevice()) {
            return this.testPostUProvider;
        }
        return null;
    }

    private final CredentialProvider tryCreatePreUOemProvider() throws PackageManager.NameNotFoundException {
        if (!this.testMode) {
            List<String> allowedProvidersFromManifest = getAllowedProvidersFromManifest(this.context);
            if (allowedProvidersFromManifest.isEmpty()) {
                return null;
            }
            return instantiatePreUProvider(allowedProvidersFromManifest, this.context);
        }
        CredentialProvider credentialProvider = this.testPreUProvider;
        if (credentialProvider == null) {
            return null;
        }
        Intrinsics.h(credentialProvider);
        if (credentialProvider.isAvailableOnDevice()) {
            return this.testPreUProvider;
        }
        return null;
    }

    public final CredentialProvider getBestAvailableProvider(boolean shouldFallbackToPreU) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            CredentialProvider credentialProviderTryCreatePostUProvider = tryCreatePostUProvider();
            return (credentialProviderTryCreatePostUProvider == null && shouldFallbackToPreU) ? tryCreatePreUOemProvider() : credentialProviderTryCreatePostUProvider;
        }
        if (i <= 33) {
            return tryCreatePreUOemProvider();
        }
        return null;
    }
}
