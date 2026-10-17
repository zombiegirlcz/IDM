package zuj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f325510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f325511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f325512c;
    public final String d;
    public final Integer e;

    public w(List items, s headerState, List monthTabs, String str, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(monthTabs, "monthTabs");
        this.f325510a = items;
        this.f325511b = headerState;
        this.f325512c = monthTabs;
        this.d = str;
        this.e = num;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof w)) {
            return null;
        }
        return new v(!Intrinsics.f(this.f325510a, ((w) oldState).f325510a));
    }

    @Override // cli.p
    public final List c() {
        return this.f325510a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f325510a, wVar.f325510a) && Intrinsics.f(this.f325511b, wVar.f325511b) && Intrinsics.f(this.f325512c, wVar.f325512c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f325511b.hashCode() + (this.f325510a.hashCode() * 31)) * 31, 31, this.f325512c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public /* synthetic */ w(List list, s sVar, f0 f0Var) {
        this(list, sVar, f0Var, null, null);
    }
}
