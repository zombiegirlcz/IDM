package mx0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v3 implements ix0.a2, Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f210042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f210043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f210044c;

    public v3(ArrayList enterTransitions, ArrayList exitTransitions) {
        Intrinsics.checkNotNullParameter(enterTransitions, "enterTransitions");
        Intrinsics.checkNotNullParameter(exitTransitions, "exitTransitions");
        this.f210042a = enterTransitions;
        this.f210044c = exitTransitions.size();
    }

    @Override // ix0.a2
    public final void cancel() {
        this.f210043b = true;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (!this.f210043b) {
            int i = this.f210044c - 1;
            this.f210044c = i;
            if (i == 0) {
                Iterator it8 = this.f210042a.iterator();
                while (it8.hasNext()) {
                    ((Function1) it8.next()).invoke(null);
                }
            }
        }
        return Unit.f186387a;
    }
}
