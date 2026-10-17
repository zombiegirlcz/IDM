package jkl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Ljkl/y2;", "", "", "toString", "()Ljava/lang/String;", "Ljkl/y2$a;", "a", "Ljkl/y2$a;", "b", "()Ljkl/y2$a;", "name", "Ljava/lang/String;", "id", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final a name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    private final String id;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Ljkl/y2$a;", "", "", "externalId", "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "BANK_ID", "DAP_ID", "GOOGLE_ID", "UAE_PASS_ID", "UNKNOWN", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @lg.b("bankIdSe")
        public static final a BANK_ID;

        @lg.b("dapId")
        public static final a DAP_ID;

        @lg.b("googleId")
        public static final a GOOGLE_ID;

        @lg.b("uaePassId")
        public static final a UAE_PASS_ID;

        @he0.b
        public static final a UNKNOWN;

        @lg.b("name")
        @NotNull
        private final String externalId;

        static {
            a aVar = new a("BANK_ID", 0, "bankIdSe");
            BANK_ID = aVar;
            a aVar2 = new a("DAP_ID", 1, "dapId");
            DAP_ID = aVar2;
            a aVar3 = new a("GOOGLE_ID", 2, "googleId");
            GOOGLE_ID = aVar3;
            a aVar4 = new a("UAE_PASS_ID", 3, "uaePassId");
            UAE_PASS_ID = aVar4;
            a aVar5 = new a("UNKNOWN", 4, "");
            UNKNOWN = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = vc.s.n(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.externalId = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj2;
        return this.name == y2Var.name && Intrinsics.f(this.id, y2Var.id);
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.id;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
