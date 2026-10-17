package ir8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f168011a;

    public a(List transferValidators) {
        Intrinsics.checkNotNullParameter(transferValidators, "transferValidators");
        this.f168011a = transferValidators;
    }

    @Override // yqi.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yqi.d validate(j validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        List list = this.f168011a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((g) it8.next()).validate(validationData).f316033b);
        }
        return new yqi.d(validationData, d0.U(w.u(arrayList)));
    }
}
