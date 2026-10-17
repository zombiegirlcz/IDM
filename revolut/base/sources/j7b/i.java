package j7b;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f171893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f171894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171895c;

    public i(Data rewardsData, Set expandedSectionTitles, String str) {
        Intrinsics.checkNotNullParameter(rewardsData, "rewardsData");
        Intrinsics.checkNotNullParameter(expandedSectionTitles, "expandedSectionTitles");
        this.f171893a = rewardsData;
        this.f171894b = expandedSectionTitles;
        this.f171895c = str;
    }

    public static i a(i iVar, Data rewardsData, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            rewardsData = iVar.f171893a;
        }
        Set expandedSectionTitles = linkedHashSet;
        if ((i & 2) != 0) {
            expandedSectionTitles = iVar.f171894b;
        }
        String str = (i & 4) != 0 ? iVar.f171895c : null;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(rewardsData, "rewardsData");
        Intrinsics.checkNotNullParameter(expandedSectionTitles, "expandedSectionTitles");
        return new i(rewardsData, expandedSectionTitles, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f171893a, iVar.f171893a) && Intrinsics.f(this.f171894b, iVar.f171894b) && Intrinsics.f(this.f171895c, iVar.f171895c);
    }

    public final int hashCode() {
        int iF = p.a.f(this.f171893a.hashCode() * 31, 31, this.f171894b);
        String str = this.f171895c;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
