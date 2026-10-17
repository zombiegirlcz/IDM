package mqk;

import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import do3.n;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mqk.g;
import oq9.o;
import pcd.a0;
import pcd.x;
import pcd.z;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f208024b;

    public /* synthetic */ g(n nVar, int i, boolean z) {
        this.f208023a = i;
        this.f208024b = nVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        int i = this.f208023a;
        n nVar = this.f208024b;
        final int i2 = 3;
        final int i3 = 2;
        final int i5 = 1;
        final int i6 = 0;
        switch (i) {
            case 0:
                x o110 = (x) obj2;
                x o210 = (x) obj3;
                Intrinsics.checkNotNullParameter(o110, "o1");
                Intrinsics.checkNotNullParameter(o210, "o2");
                return cim.b.c(o110, o210, new Function1(this) { // from class: mqk.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f208020b;

                    {
                        this.f208020b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i21;
                        x it8 = (x) obj4;
                        switch (i6) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return Integer.valueOf(!Intrinsics.f(it8.f234903a, this.f208020b.f208024b.f116408a) ? 1 : 0);
                            case 1:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                z zVar = it8.f234905c;
                                this.f208020b.getClass();
                                return Integer.valueOf(f.f208021a[zVar.ordinal()] == 1 ? 0 : 1);
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                a0 a0Var = it8.f234904b;
                                this.f208020b.getClass();
                                switch (f.f208022b[a0Var.ordinal()]) {
                                    case 1:
                                        i21 = 0;
                                        break;
                                    case 2:
                                        i21 = 1;
                                        break;
                                    case 3:
                                        i21 = 2;
                                        break;
                                    case 4:
                                        i21 = 3;
                                        break;
                                    case 5:
                                        i21 = 4;
                                        break;
                                    case 6:
                                        i21 = 5;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                return Integer.valueOf(i21);
                        }
                    }
                }, new Function1(this) { // from class: mqk.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f208020b;

                    {
                        this.f208020b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i21;
                        x it8 = (x) obj4;
                        switch (i5) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return Integer.valueOf(!Intrinsics.f(it8.f234903a, this.f208020b.f208024b.f116408a) ? 1 : 0);
                            case 1:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                z zVar = it8.f234905c;
                                this.f208020b.getClass();
                                return Integer.valueOf(f.f208021a[zVar.ordinal()] == 1 ? 0 : 1);
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                a0 a0Var = it8.f234904b;
                                this.f208020b.getClass();
                                switch (f.f208022b[a0Var.ordinal()]) {
                                    case 1:
                                        i21 = 0;
                                        break;
                                    case 2:
                                        i21 = 1;
                                        break;
                                    case 3:
                                        i21 = 2;
                                        break;
                                    case 4:
                                        i21 = 3;
                                        break;
                                    case 5:
                                        i21 = 4;
                                        break;
                                    case 6:
                                        i21 = 5;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                return Integer.valueOf(i21);
                        }
                    }
                }, new Function1(this) { // from class: mqk.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f208020b;

                    {
                        this.f208020b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i21;
                        x it8 = (x) obj4;
                        switch (i3) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return Integer.valueOf(!Intrinsics.f(it8.f234903a, this.f208020b.f208024b.f116408a) ? 1 : 0);
                            case 1:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                z zVar = it8.f234905c;
                                this.f208020b.getClass();
                                return Integer.valueOf(f.f208021a[zVar.ordinal()] == 1 ? 0 : 1);
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                a0 a0Var = it8.f234904b;
                                this.f208020b.getClass();
                                switch (f.f208022b[a0Var.ordinal()]) {
                                    case 1:
                                        i21 = 0;
                                        break;
                                    case 2:
                                        i21 = 1;
                                        break;
                                    case 3:
                                        i21 = 2;
                                        break;
                                    case 4:
                                        i21 = 3;
                                        break;
                                    case 5:
                                        i21 = 4;
                                        break;
                                    case 6:
                                        i21 = 5;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                return Integer.valueOf(i21);
                        }
                    }
                }, new mqg.b(i2));
            case 1:
                o oVar = (o) obj2;
                o oVar2 = (o) obj3;
                return cim.b.b(oi0.d.G(oVar, nVar) ? "0" : j6.a.q("1", oi0.d.p(oVar)), oi0.d.G(oVar2, nVar) ? "0" : j6.a.q("1", oi0.d.p(oVar2)));
            case 2:
                x o111 = (x) obj2;
                x o211 = (x) obj3;
                Intrinsics.checkNotNullParameter(o111, "o1");
                Intrinsics.checkNotNullParameter(o211, "o2");
                return cim.b.c(o111, o211, new Function1(this) { // from class: q7e.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f242855b;

                    {
                        this.f242855b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i21;
                        x it8 = (x) obj4;
                        switch (i6) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return Integer.valueOf(!Intrinsics.f(it8.f234903a, this.f242855b.f208024b.f116408a) ? 1 : 0);
                            case 1:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                z zVar = it8.f234905c;
                                this.f242855b.getClass();
                                return Integer.valueOf(d.f242856a[zVar.ordinal()] == 1 ? 0 : 1);
                            case 2:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                a0 a0Var = it8.f234904b;
                                this.f242855b.getClass();
                                switch (d.f242857b[a0Var.ordinal()]) {
                                    case 1:
                                        i21 = 0;
                                        break;
                                    case 2:
                                        i21 = 1;
                                        break;
                                    case 3:
                                        i21 = 2;
                                        break;
                                    case 4:
                                        i21 = 3;
                                        break;
                                    case 5:
                                        i21 = 4;
                                        break;
                                    case 6:
                                        i21 = 5;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                return Integer.valueOf(i21);
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                this.f242855b.getClass();
                                return Integer.valueOf(-((int) it8.f));
                        }
                    }
                }, new Function1(this) { // from class: q7e.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f242855b;

                    {
                        this.f242855b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i21;
                        x it8 = (x) obj4;
                        switch (i5) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return Integer.valueOf(!Intrinsics.f(it8.f234903a, this.f242855b.f208024b.f116408a) ? 1 : 0);
                            case 1:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                z zVar = it8.f234905c;
                                this.f242855b.getClass();
                                return Integer.valueOf(d.f242856a[zVar.ordinal()] == 1 ? 0 : 1);
                            case 2:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                a0 a0Var = it8.f234904b;
                                this.f242855b.getClass();
                                switch (d.f242857b[a0Var.ordinal()]) {
                                    case 1:
                                        i21 = 0;
                                        break;
                                    case 2:
                                        i21 = 1;
                                        break;
                                    case 3:
                                        i21 = 2;
                                        break;
                                    case 4:
                                        i21 = 3;
                                        break;
                                    case 5:
                                        i21 = 4;
                                        break;
                                    case 6:
                                        i21 = 5;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                return Integer.valueOf(i21);
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                this.f242855b.getClass();
                                return Integer.valueOf(-((int) it8.f));
                        }
                    }
                }, new Function1(this) { // from class: q7e.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f242855b;

                    {
                        this.f242855b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i21;
                        x it8 = (x) obj4;
                        switch (i3) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return Integer.valueOf(!Intrinsics.f(it8.f234903a, this.f242855b.f208024b.f116408a) ? 1 : 0);
                            case 1:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                z zVar = it8.f234905c;
                                this.f242855b.getClass();
                                return Integer.valueOf(d.f242856a[zVar.ordinal()] == 1 ? 0 : 1);
                            case 2:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                a0 a0Var = it8.f234904b;
                                this.f242855b.getClass();
                                switch (d.f242857b[a0Var.ordinal()]) {
                                    case 1:
                                        i21 = 0;
                                        break;
                                    case 2:
                                        i21 = 1;
                                        break;
                                    case 3:
                                        i21 = 2;
                                        break;
                                    case 4:
                                        i21 = 3;
                                        break;
                                    case 5:
                                        i21 = 4;
                                        break;
                                    case 6:
                                        i21 = 5;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                return Integer.valueOf(i21);
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                this.f242855b.getClass();
                                return Integer.valueOf(-((int) it8.f));
                        }
                    }
                }, new Function1(this) { // from class: q7e.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f242855b;

                    {
                        this.f242855b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i21;
                        x it8 = (x) obj4;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return Integer.valueOf(!Intrinsics.f(it8.f234903a, this.f242855b.f208024b.f116408a) ? 1 : 0);
                            case 1:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                z zVar = it8.f234905c;
                                this.f242855b.getClass();
                                return Integer.valueOf(d.f242856a[zVar.ordinal()] == 1 ? 0 : 1);
                            case 2:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                a0 a0Var = it8.f234904b;
                                this.f242855b.getClass();
                                switch (d.f242857b[a0Var.ordinal()]) {
                                    case 1:
                                        i21 = 0;
                                        break;
                                    case 2:
                                        i21 = 1;
                                        break;
                                    case 3:
                                        i21 = 2;
                                        break;
                                    case 4:
                                        i21 = 3;
                                        break;
                                    case 5:
                                        i21 = 4;
                                        break;
                                    case 6:
                                        i21 = 5;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                return Integer.valueOf(i21);
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                this.f242855b.getClass();
                                return Integer.valueOf(-((int) it8.f));
                        }
                    }
                }, new q75.n(15));
            default:
                SplitMemberType.GroupMember groupMember = (SplitMemberType.GroupMember) obj2;
                SplitMemberType.GroupMember groupMember2 = (SplitMemberType.GroupMember) obj3;
                return cim.b.b(oi0.d.G(groupMember.f79216a, nVar) ? "" : groupMember.f79216a.b(), oi0.d.G(groupMember2.f79216a, nVar) ? "" : groupMember2.f79216a.b());
        }
    }

    public g(n user, int i) {
        this.f208023a = i;
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(user, "user");
                this.f208024b = user;
                break;
            default:
                Intrinsics.checkNotNullParameter(user, "user");
                this.f208024b = user;
                break;
        }
    }
}
