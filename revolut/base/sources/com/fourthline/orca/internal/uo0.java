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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/internal/uo0;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", "d", "e", "f", "g", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class uo0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f34145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uo0 f34146b = new uo0("UtilityBill", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final uo0 f34147c = new uo0("TaxInvoice", 1);
    public static final uo0 d = new uo0("Insurance", 2);
    public static final uo0 e = new uo0("ProofOfHousing", 3);
    public static final uo0 f = new uo0("BankStatement", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final uo0 f34148g = new uo0("Other", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ uo0[] f34149h;
    private static final /* synthetic */ EnumEntries i;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.uo0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) uo0.f34145a.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    static {
        uo0[] uo0VarArrA = a();
        f34149h = uo0VarArrA;
        i = vc.s.n(uo0VarArrA);
        INSTANCE = new Companion(null);
        f34145a = yhm.j.c(yhm.k.PUBLICATION, new nr1(24));
    }

    private uo0(String str, int i2) {
    }

    private static final /* synthetic */ uo0[] a() {
        return new uo0[]{f34146b, f34147c, d, e, f, f34148g};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return qlm.j1.b("com.fourthline.orca.kyc.internal.flow.poa.PoaDocumentType", values());
    }

    public static EnumEntries d() {
        return i;
    }

    public static uo0 valueOf(String str) {
        return (uo0) Enum.valueOf(uo0.class, str);
    }

    public static uo0[] values() {
        return (uo0[]) f34149h.clone();
    }
}
