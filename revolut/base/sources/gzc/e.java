package gzc;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f147992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f147993c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f147994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f147995h;
    public final ArrayList i;

    public e(String incomeSourceType, k incomeDestination, long j2, String currency, String incomeFrequency, String str, String str2, String str3, ArrayList answers) {
        Intrinsics.checkNotNullParameter(incomeSourceType, "incomeSourceType");
        Intrinsics.checkNotNullParameter(incomeDestination, "incomeDestination");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(incomeFrequency, "incomeFrequency");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f147991a = incomeSourceType;
        this.f147992b = incomeDestination;
        this.f147993c = j2;
        this.d = currency;
        this.e = incomeFrequency;
        this.f = str;
        this.f147994g = str2;
        this.f147995h = str3;
        this.i = answers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f147991a, eVar.f147991a) && this.f147992b == eVar.f147992b && this.f147993c == eVar.f147993c && this.d.equals(eVar.d) && this.e.equals(eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f147994g, eVar.f147994g) && Intrinsics.f(this.f147995h, eVar.f147995h) && this.i.equals(eVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(a0.d.c((this.f147992b.hashCode() + (this.f147991a.hashCode() * 31)) * 31, 31, this.f147993c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f147994g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f147995h;
        return this.i.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
