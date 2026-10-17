package db;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f112620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112622c;
    public final Data d;
    public final String e;
    public final Set f;

    public l(Data userDetails, String selectedTabId, String str, Data data, String str2, Set selectedConsents) {
        Intrinsics.checkNotNullParameter(userDetails, "userDetails");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(selectedConsents, "selectedConsents");
        this.f112620a = userDetails;
        this.f112621b = selectedTabId;
        this.f112622c = str;
        this.d = data;
        this.e = str2;
        this.f = selectedConsents;
    }

    public static l a(l lVar, Data data, String str, String str2, Data data2, String str3, Set set, int i) {
        if ((i & 1) != 0) {
            data = lVar.f112620a;
        }
        Data userDetails = data;
        if ((i & 2) != 0) {
            str = lVar.f112621b;
        }
        String selectedTabId = str;
        if ((i & 4) != 0) {
            str2 = lVar.f112622c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            data2 = lVar.d;
        }
        Data data3 = data2;
        if ((i & 16) != 0) {
            str3 = lVar.e;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            set = lVar.f;
        }
        Set selectedConsents = set;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(userDetails, "userDetails");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(selectedConsents, "selectedConsents");
        return new l(userDetails, selectedTabId, str4, data3, str5, selectedConsents);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f112620a, lVar.f112620a) && Intrinsics.f(this.f112621b, lVar.f112621b) && Intrinsics.f(this.f112622c, lVar.f112622c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f112620a.hashCode() * 31, 31, this.f112621b);
        String str = this.f112622c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Data data = this.d;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DomainState(userDetails=" + this.f112620a + ", selectedTabId=" + this.f112621b + ", sectionIdToScroll=" + this.f112622c + ", userProfile=" + this.d + ", selectedFieldId=" + this.e + ", selectedConsents=" + this.f + ")";
    }
}
