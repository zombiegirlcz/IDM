package qfi;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u000b\u0010\u001b¨\u0006\u001d"}, d2 = {"Lqfi/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "g", "type", "c", "f", "start", "d", "end", "", "e", "D", "()D", "maxDiscountPercentage", "Lqfi/a$a;", "Lqfi/a$a;", "()Lqfi/a$a;", "requirements", "Lpfi/a;", "Lpfi/a;", "()Lpfi/a;", "location", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("start")
    @NotNull
    private final String start;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("end")
    @NotNull
    private final String end;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("maxDiscountPercentage")
    private final double maxDiscountPercentage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("requirements")
    private final C1346a requirements;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("location")
    @NotNull
    private final pfi.a location;

    /* JADX INFO: renamed from: qfi.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lqfi/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "checkInFrom", "b", "checkOutTo", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1346a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("checkInFrom")
        @NotNull
        private final String checkInFrom;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("checkOutTo")
        @NotNull
        private final String checkOutTo;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCheckInFrom() {
            return this.checkInFrom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCheckOutTo() {
            return this.checkOutTo;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1346a)) {
                return false;
            }
            C1346a c1346a = (C1346a) obj2;
            return Intrinsics.f(this.checkInFrom, c1346a.checkInFrom) && Intrinsics.f(this.checkOutTo, c1346a.checkOutTo);
        }

        public final int hashCode() {
            return this.checkOutTo.hashCode() + (this.checkInFrom.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final pfi.a getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getMaxDiscountPercentage() {
        return this.maxDiscountPercentage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C1346a getRequirements() {
        return this.requirements;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.start, aVar.start) && Intrinsics.f(this.end, aVar.end) && Double.compare(this.maxDiscountPercentage, aVar.maxDiscountPercentage) == 0 && Intrinsics.f(this.requirements, aVar.requirements) && Intrinsics.f(this.location, aVar.location);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iC = m72.b.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.start), 31, this.end), this.maxDiscountPercentage, 31);
        C1346a c1346a = this.requirements;
        return this.location.hashCode() + ((iC + (c1346a == null ? 0 : c1346a.hashCode())) * 31);
    }
}
