package rm0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    @NotNull
    private static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ih0.b f255151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f255152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f255153c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f255154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f255155h;

    public e0(ih0.b remoteConfig) {
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        this.f255151a = remoteConfig;
        yhm.k kVar = yhm.k.SYNCHRONIZED;
        final int i = 0;
        this.f255152b = yhm.j.c(kVar, new Function0(this) { // from class: rm0.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f255148b;

            {
                this.f255148b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zB;
                switch (i) {
                    case 0:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_NEW_BIOMETRIC_FLOW_ENABLED");
                        break;
                    case 1:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_HARDWARE_ONLY_KEYSTORE_ENABLED");
                        break;
                    case 2:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_SESSION_RECREATED_ON_PASSCODE_CHANGE");
                        break;
                    case 3:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_FOR_SDK_28_AND_ABOVE");
                        break;
                    case 4:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_DECRYPTION_CIPHER_CACHE_ENABLED");
                        break;
                    case 5:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_STUCK_PATCH_ENABLED");
                        break;
                    default:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_CIPHER_V2_MIGRATION_ENABLED");
                        break;
                }
                return Boolean.valueOf(zB);
            }
        });
        final int i2 = 1;
        this.f255153c = yhm.j.c(kVar, new Function0(this) { // from class: rm0.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f255148b;

            {
                this.f255148b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zB;
                switch (i2) {
                    case 0:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_NEW_BIOMETRIC_FLOW_ENABLED");
                        break;
                    case 1:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_HARDWARE_ONLY_KEYSTORE_ENABLED");
                        break;
                    case 2:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_SESSION_RECREATED_ON_PASSCODE_CHANGE");
                        break;
                    case 3:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_FOR_SDK_28_AND_ABOVE");
                        break;
                    case 4:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_DECRYPTION_CIPHER_CACHE_ENABLED");
                        break;
                    case 5:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_STUCK_PATCH_ENABLED");
                        break;
                    default:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_CIPHER_V2_MIGRATION_ENABLED");
                        break;
                }
                return Boolean.valueOf(zB);
            }
        });
        final int i3 = 2;
        this.d = yhm.j.c(kVar, new Function0(this) { // from class: rm0.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f255148b;

            {
                this.f255148b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zB;
                switch (i3) {
                    case 0:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_NEW_BIOMETRIC_FLOW_ENABLED");
                        break;
                    case 1:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_HARDWARE_ONLY_KEYSTORE_ENABLED");
                        break;
                    case 2:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_SESSION_RECREATED_ON_PASSCODE_CHANGE");
                        break;
                    case 3:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_FOR_SDK_28_AND_ABOVE");
                        break;
                    case 4:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_DECRYPTION_CIPHER_CACHE_ENABLED");
                        break;
                    case 5:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_STUCK_PATCH_ENABLED");
                        break;
                    default:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_CIPHER_V2_MIGRATION_ENABLED");
                        break;
                }
                return Boolean.valueOf(zB);
            }
        });
        final int i5 = 3;
        this.e = yhm.j.c(kVar, new Function0(this) { // from class: rm0.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f255148b;

            {
                this.f255148b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zB;
                switch (i5) {
                    case 0:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_NEW_BIOMETRIC_FLOW_ENABLED");
                        break;
                    case 1:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_HARDWARE_ONLY_KEYSTORE_ENABLED");
                        break;
                    case 2:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_SESSION_RECREATED_ON_PASSCODE_CHANGE");
                        break;
                    case 3:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_FOR_SDK_28_AND_ABOVE");
                        break;
                    case 4:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_DECRYPTION_CIPHER_CACHE_ENABLED");
                        break;
                    case 5:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_STUCK_PATCH_ENABLED");
                        break;
                    default:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_CIPHER_V2_MIGRATION_ENABLED");
                        break;
                }
                return Boolean.valueOf(zB);
            }
        });
        final int i6 = 4;
        this.f = yhm.j.c(kVar, new Function0(this) { // from class: rm0.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f255148b;

            {
                this.f255148b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zB;
                switch (i6) {
                    case 0:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_NEW_BIOMETRIC_FLOW_ENABLED");
                        break;
                    case 1:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_HARDWARE_ONLY_KEYSTORE_ENABLED");
                        break;
                    case 2:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_SESSION_RECREATED_ON_PASSCODE_CHANGE");
                        break;
                    case 3:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_FOR_SDK_28_AND_ABOVE");
                        break;
                    case 4:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_DECRYPTION_CIPHER_CACHE_ENABLED");
                        break;
                    case 5:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_STUCK_PATCH_ENABLED");
                        break;
                    default:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_CIPHER_V2_MIGRATION_ENABLED");
                        break;
                }
                return Boolean.valueOf(zB);
            }
        });
        final int i21 = 5;
        this.f255154g = yhm.j.c(kVar, new Function0(this) { // from class: rm0.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f255148b;

            {
                this.f255148b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zB;
                switch (i21) {
                    case 0:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_NEW_BIOMETRIC_FLOW_ENABLED");
                        break;
                    case 1:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_HARDWARE_ONLY_KEYSTORE_ENABLED");
                        break;
                    case 2:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_SESSION_RECREATED_ON_PASSCODE_CHANGE");
                        break;
                    case 3:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_FOR_SDK_28_AND_ABOVE");
                        break;
                    case 4:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_DECRYPTION_CIPHER_CACHE_ENABLED");
                        break;
                    case 5:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_STUCK_PATCH_ENABLED");
                        break;
                    default:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_CIPHER_V2_MIGRATION_ENABLED");
                        break;
                }
                return Boolean.valueOf(zB);
            }
        });
        final int i22 = 6;
        this.f255155h = yhm.j.c(kVar, new Function0(this) { // from class: rm0.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f255148b;

            {
                this.f255148b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zB;
                switch (i22) {
                    case 0:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_NEW_BIOMETRIC_FLOW_ENABLED");
                        break;
                    case 1:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_HARDWARE_ONLY_KEYSTORE_ENABLED");
                        break;
                    case 2:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_SESSION_RECREATED_ON_PASSCODE_CHANGE");
                        break;
                    case 3:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_FOR_SDK_28_AND_ABOVE");
                        break;
                    case 4:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_DECRYPTION_CIPHER_CACHE_ENABLED");
                        break;
                    case 5:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_BIOMETRIC_PROMPT_STUCK_PATCH_ENABLED");
                        break;
                    default:
                        zB = ((ii0.b) this.f255148b.f255151a).b("PM_ANDROID_CIPHER_V2_MIGRATION_ENABLED");
                        break;
                }
                return Boolean.valueOf(zB);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean a() {
        return ((Boolean) this.f255152b.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean b() {
        return ((Boolean) this.f255155h.getValue()).booleanValue();
    }
}
