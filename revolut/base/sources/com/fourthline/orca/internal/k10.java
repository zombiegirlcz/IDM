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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/fourthline/orca/internal/k10;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", "d", "e", "f", "g", "h", "i", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class k10 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f30092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k10 f30093b = new k10("NEW", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k10 f30094c = new k10("PENDING", 1);
    public static final k10 d = new k10("INCONSISTENT_DATA", 2);
    public static final k10 e = new k10("INVALID_DATA", 3);
    public static final k10 f = new k10("SUCCESS", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k10 f30095g = new k10("REJECTED", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k10 f30096h = new k10("FRAUD", 6);
    public static final k10 i = new k10("COMPLETED", 7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ k10[] f30097j;
    private static final /* synthetic */ EnumEntries k;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.k10$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) k10.f30092a.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    static {
        k10[] k10VarArrA = a();
        f30097j = k10VarArrA;
        k = vc.s.n(k10VarArrA);
        INSTANCE = new Companion(null);
        f30092a = yhm.j.c(yhm.k.PUBLICATION, new wn1(16));
    }

    private k10(String str, int i2) {
    }

    private static final /* synthetic */ k10[] a() {
        return new k10[]{f30093b, f30094c, d, e, f, f30095g, f30096h, i};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return qlm.j1.b("com.fourthline.orca.core.internal.backend.model.IdvVerificationStatus", values());
    }

    public static k10 valueOf(String str) {
        return (k10) Enum.valueOf(k10.class, str);
    }

    public static k10[] values() {
        return (k10[]) f30097j.clone();
    }
}
