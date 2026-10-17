package rg3;

import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f254005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f254006c;

    public /* synthetic */ h(int i, String str, Function1 function1) {
        this.f254004a = i;
        this.f254005b = function1;
        this.f254006c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f254004a) {
            case 0:
                Iterator it8 = ((List) obj2).iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((ChecklistChallenge) next).f65775a, this.f254006c)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return Boolean.valueOf(!((Boolean) this.f254005b.invoke((ChecklistChallenge) next)).booleanValue());
            default:
                xsh.d updateState = (xsh.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                ArrayList arrayListF1 = d0.f1(updateState.f308493a);
                Iterator it9 = arrayListF1.iterator();
                int i = 0;
                while (true) {
                    if (!it9.hasNext()) {
                        i = -1;
                    } else if (!Intrinsics.f(((xsh.h) it9.next()).f308500a, this.f254006c)) {
                        i++;
                    }
                }
                if (i < 0) {
                    return updateState;
                }
                arrayListF1.set(i, this.f254005b.invoke(arrayListF1.get(i)));
                return xsh.d.a(updateState, arrayListF1, 0, 2);
        }
    }
}
