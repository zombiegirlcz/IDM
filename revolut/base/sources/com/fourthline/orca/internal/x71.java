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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\u0005¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/internal/x71;", "", "<init>", "(Ljava/lang/String;I)V", "", "d", "()Ljava/lang/String;", "alpha3", "Companion", "a", "b", "c", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class x71 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f34914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x71 f34915b = new x71("ESP", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x71 f34916c = new x71("ITA", 1);
    public static final x71 d = new x71("NLD", 2);
    private static final /* synthetic */ x71[] e;
    private static final /* synthetic */ EnumEntries f;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.x71$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) x71.f34914a.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    static {
        x71[] x71VarArrA = a();
        e = x71VarArrA;
        f = vc.s.n(x71VarArrA);
        INSTANCE = new Companion(null);
        f34914a = yhm.j.c(yhm.k.PUBLICATION, new it1(0));
    }

    private x71(String str, int i) {
    }

    private static final /* synthetic */ x71[] a() {
        return new x71[]{f34915b, f34916c, d};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return qlm.j1.b("com.fourthline.orca.kyc.internal.flow.tin.model.TaxationCountry", values());
    }

    public static x71 valueOf(String str) {
        return (x71) Enum.valueOf(x71.class, str);
    }

    public static x71[] values() {
        return (x71[]) e.clone();
    }

    public final String d() {
        return toString();
    }
}
