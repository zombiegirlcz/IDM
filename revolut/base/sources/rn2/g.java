package rn2;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\b\u0010\u0015¨\u0006\u0017"}, d2 = {"Lrn2/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "description", "b", "c", "switchMethod", "d", "switchStartDate", "Lrn2/b;", "Lrn2/b;", "e", "()Lrn2/b;", "transferDateConfig", "", "Lrn2/g$a;", "Ljava/util/List;", "()Ljava/util/List;", "payments", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("switchMethod")
    @NotNull
    private final String switchMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("switchStartDate")
    private final String switchStartDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("transferDateConfig")
    private final b transferDateConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("payments")
    @NotNull
    private final List<a> payments;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\r\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b!\u0010\u0004R\u001a\u0010#\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010¨\u0006$"}, d2 = {"Lrn2/g$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "beneficiaryName", "beneficiaryImage", "", "d", "Z", "g", "()Z", "scheduleSupported", "e", "k", "type", "Ljo3/a;", "f", "Ljo3/a;", "()Ljo3/a;", "money", "i", "startDate", "h", "nextDate", "j", "transferDate", "period", "l", "unsupportedPeriod", "selectable", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("beneficiaryName")
        @NotNull
        private final String beneficiaryName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("beneficiaryImage")
        private final String beneficiaryImage;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("scheduleSupported")
        private final boolean scheduleSupported;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("money")
        private final jo3.a money;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("startDate")
        private final String startDate;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("nextDate")
        private final String nextDate;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("transferDate")
        private final String transferDate;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("period")
        private final String period;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("unsupportedPeriod")
        private final String unsupportedPeriod;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @lg.b("selectable")
        private final boolean selectable;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBeneficiaryImage() {
            return this.beneficiaryImage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBeneficiaryName() {
            return this.beneficiaryName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getMoney() {
            return this.money;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getNextDate() {
            return this.nextDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.beneficiaryName, aVar.beneficiaryName) && Intrinsics.f(this.beneficiaryImage, aVar.beneficiaryImage) && this.scheduleSupported == aVar.scheduleSupported && Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.money, aVar.money) && Intrinsics.f(this.startDate, aVar.startDate) && Intrinsics.f(this.nextDate, aVar.nextDate) && Intrinsics.f(this.transferDate, aVar.transferDate) && Intrinsics.f(this.period, aVar.period) && Intrinsics.f(this.unsupportedPeriod, aVar.unsupportedPeriod) && this.selectable == aVar.selectable;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPeriod() {
            return this.period;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getScheduleSupported() {
            return this.scheduleSupported;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getSelectable() {
            return this.selectable;
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.beneficiaryName);
            String str = this.beneficiaryImage;
            int iC2 = p.a.c(j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.scheduleSupported), 31, this.type);
            jo3.a aVar = this.money;
            int iHashCode = (iC2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str2 = this.startDate;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.nextDate;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.transferDate;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.period;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.unsupportedPeriod;
            return Boolean.hashCode(this.selectable) + ((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getStartDate() {
            return this.startDate;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getTransferDate() {
            return this.transferDate;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getUnsupportedPeriod() {
            return this.unsupportedPeriod;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPayments() {
        return this.payments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSwitchMethod() {
        return this.switchMethod;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSwitchStartDate() {
        return this.switchStartDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getTransferDateConfig() {
        return this.transferDateConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.description, gVar.description) && Intrinsics.f(this.switchMethod, gVar.switchMethod) && Intrinsics.f(this.switchStartDate, gVar.switchStartDate) && Intrinsics.f(this.transferDateConfig, gVar.transferDateConfig) && Intrinsics.f(this.payments, gVar.payments);
    }

    public final int hashCode() {
        int iC = p.a.c(this.description.hashCode() * 31, 31, this.switchMethod);
        String str = this.switchStartDate;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.transferDateConfig;
        return this.payments.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }
}
