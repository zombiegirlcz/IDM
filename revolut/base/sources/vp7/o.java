package vp7;

import com.revolut.feature.insurance_car.impl.data.model.Answer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f291127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Answer.ClaimType f291128c;

    public /* synthetic */ o(int i, Answer.ClaimType claimType, int i2) {
        this.f291126a = i2;
        this.f291127b = i;
        this.f291128c = claimType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f291126a) {
            case 0:
                i updateState = (i) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                ArrayList arrayList = updateState.f291116a;
                ArrayList details = new ArrayList(w.t(arrayList, 10));
                int i = 0;
                for (Object objA : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    if (i == this.f291127b) {
                        objA = b.a((b) objA, null, this.f291128c, null, null, 13);
                    }
                    details.add(objA);
                    i = i2;
                }
                Intrinsics.checkNotNullParameter(details, "details");
                return new i(details);
            default:
                yo7.h updateState2 = (yo7.h) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                List list = updateState2.i;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                int i3 = 0;
                for (Object objA2 : list) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        v.s();
                        throw null;
                    }
                    if (i3 == this.f291127b) {
                        objA2 = b.a((b) objA2, null, this.f291128c, null, null, 13);
                    }
                    arrayList2.add(objA2);
                    i3 = i5;
                }
                return yo7.h.a(updateState2, null, null, null, null, null, null, null, arrayList2, null, null, null, null, null, 16127);
        }
    }
}
