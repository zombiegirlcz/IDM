package hzj;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import mha.s;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        mha.m mVar = ((s) obj3).f205465c;
        mha.l lVar = mha.m.Companion;
        lVar.getClass();
        mha.m mVar2 = mha.m.f205458g;
        Boolean boolValueOf = Boolean.valueOf(Intrinsics.f(mVar, mVar2));
        mha.m mVar3 = ((s) obj2).f205465c;
        lVar.getClass();
        return cim.b.b(boolValueOf, Boolean.valueOf(Intrinsics.f(mVar3, mVar2)));
    }
}
