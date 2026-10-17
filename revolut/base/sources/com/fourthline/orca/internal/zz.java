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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/fourthline/orca/internal/zz;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", "d", "e", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class zz {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f35753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zz f35754b = new zz("NEW", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zz f35755c = new zz("PENDING", 1);
    public static final zz d = new zz("COMPLETED", 2);
    public static final zz e = new zz("FAILED", 3);
    private static final /* synthetic */ zz[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f35756g;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.zz$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) zz.f35753a.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    static {
        zz[] zzVarArrA = a();
        f = zzVarArrA;
        f35756g = vc.s.n(zzVarArrA);
        INSTANCE = new Companion(null);
        f35753a = yhm.j.c(yhm.k.PUBLICATION, new vt1(2));
    }

    private zz(String str, int i) {
    }

    private static final /* synthetic */ zz[] a() {
        return new zz[]{f35754b, f35755c, d, e};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return qlm.j1.b("com.fourthline.orca.core.internal.backend.model.GenericVerificationWorkflowStatus", values());
    }

    public static zz valueOf(String str) {
        return (zz) Enum.valueOf(zz.class, str);
    }

    public static zz[] values() {
        return (zz[]) f.clone();
    }
}
