package com.fourthline.orca.internal;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/fourthline/orca/internal/sx0;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class sx0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f33152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sx0 f33153b = new sx0("NEW", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sx0 f33154c = new sx0("PENDING", 1);
    public static final sx0 d = new sx0("REJECTED", 2);
    public static final sx0 e = new sx0("KYC_REQUIRED", 3);
    public static final sx0 f = new sx0("SELFIE_REQUIRED", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final sx0 f33155g = new sx0("USER_CONSENT_REQUIRED", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final sx0 f33156h = new sx0("CONFIRMATION_REQUIRED", 6);
    public static final sx0 i = new sx0("PENDING_VERIFICATION", 7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final sx0 f33157j = new sx0("INVALID_SIGNATURE", 8);
    public static final sx0 k = new sx0("SIGNED", 9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final sx0 f33158l = new sx0("ERROR", 10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ sx0[] f33159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f33160n;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sx0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) sx0.f33152a.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    static {
        sx0[] sx0VarArrA = a();
        f33159m = sx0VarArrA;
        f33160n = vc.s.n(sx0VarArrA);
        INSTANCE = new Companion(null);
        f33152a = yhm.j.c(yhm.k.PUBLICATION, new nr1(12));
    }

    private sx0(String str, int i2) {
    }

    private static final /* synthetic */ sx0[] a() {
        return new sx0[]{f33153b, f33154c, d, e, f, f33155g, f33156h, i, f33157j, k, f33158l};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return qlm.j1.b("com.fourthline.orca.core.internal.backend.model.QesVerificationStatus", values());
    }

    public static sx0 valueOf(String str) {
        return (sx0) Enum.valueOf(sx0.class, str);
    }

    public static sx0[] values() {
        return (sx0[]) f33159m.clone();
    }
}
