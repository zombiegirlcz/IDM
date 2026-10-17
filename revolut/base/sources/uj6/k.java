package uj6;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f280495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f280496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f280497c;
    public final Map d;
    public final Map e;

    public k(Data mandatePreviewData, j institution, Set expandedGroupIndices, Map editedDateFields, Map editedMoneyFields) {
        Intrinsics.checkNotNullParameter(mandatePreviewData, "mandatePreviewData");
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(expandedGroupIndices, "expandedGroupIndices");
        Intrinsics.checkNotNullParameter(editedDateFields, "editedDateFields");
        Intrinsics.checkNotNullParameter(editedMoneyFields, "editedMoneyFields");
        this.f280495a = mandatePreviewData;
        this.f280496b = institution;
        this.f280497c = expandedGroupIndices;
        this.d = editedDateFields;
        this.e = editedMoneyFields;
    }

    public static k a(k kVar, Data data, j jVar, LinkedHashSet linkedHashSet, Map map, Map map2, int i) {
        if ((i & 1) != 0) {
            data = kVar.f280495a;
        }
        Data mandatePreviewData = data;
        if ((i & 2) != 0) {
            jVar = kVar.f280496b;
        }
        j institution = jVar;
        Set set = linkedHashSet;
        if ((i & 4) != 0) {
            set = kVar.f280497c;
        }
        Set expandedGroupIndices = set;
        if ((i & 8) != 0) {
            map = kVar.d;
        }
        Map editedDateFields = map;
        if ((i & 16) != 0) {
            map2 = kVar.e;
        }
        Map editedMoneyFields = map2;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(mandatePreviewData, "mandatePreviewData");
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(expandedGroupIndices, "expandedGroupIndices");
        Intrinsics.checkNotNullParameter(editedDateFields, "editedDateFields");
        Intrinsics.checkNotNullParameter(editedMoneyFields, "editedMoneyFields");
        return new k(mandatePreviewData, institution, expandedGroupIndices, editedDateFields, editedMoneyFields);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f280495a, kVar.f280495a) && Intrinsics.f(this.f280496b, kVar.f280496b) && Intrinsics.f(this.f280497c, kVar.f280497c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.e(p.a.f((this.f280496b.hashCode() + (this.f280495a.hashCode() * 31)) * 31, 31, this.f280497c), 31, this.d);
    }
}
