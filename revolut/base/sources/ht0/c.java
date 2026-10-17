package ht0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewParent;
import com.revolut.core.ui_kit.delegates.hi;
import com.revolut.core.ui_kit.delegates.mi;
import com.revolut.core.ui_kit.delegates.ni;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import sgm.c1;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155115a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f155116b;

    public /* synthetic */ c(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        switch (this.f155115a) {
            case 0:
                d dVar = (d) ((WeakReference) this.f155116b).get();
                if (dVar == null) {
                    return;
                }
                int i = msg.what;
                if (i == 1) {
                    List<Integer> cursorLineIndexes = dVar.getCursorLineIndexes();
                    if (cursorLineIndexes.isEmpty()) {
                        return;
                    }
                    dVar.f155134w = true;
                    dVar.r();
                    int iIntValue = cursorLineIndexes.get(0).intValue();
                    dVar.g(iIntValue);
                    if (dVar.D != null && iIntValue >= 0 && iIntValue < dVar.f155121b.size()) {
                        ni niVar = (ni) dVar.D;
                        niVar.f54521a.d.onNext(new mi(niVar.f54522b, iIntValue, ((hw0.k) dVar.f155121b.get(iIntValue)).f156007b));
                    }
                    ViewParent parent = dVar.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                List<Integer> cursorLineIndexes2 = dVar.getCursorLineIndexes();
                if (cursorLineIndexes2.size() < 2) {
                    return;
                }
                dVar.f155134w = true;
                dVar.r();
                Integer num = cursorLineIndexes2.get(0);
                int iIntValue2 = num.intValue();
                Integer num2 = cursorLineIndexes2.get(1);
                int iIntValue3 = num2.intValue();
                dVar.h(num, num2);
                b bVar = dVar.D;
                if (bVar != null) {
                    ni niVar2 = (ni) bVar;
                    niVar2.f54521a.d.onNext(new hi(niVar2.f54522b, iIntValue2, ((hw0.k) dVar.f155121b.get(iIntValue2)).f156007b, iIntValue3, ((hw0.k) dVar.f155121b.get(iIntValue3)).f156007b));
                }
                ViewParent parent2 = dVar.getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                c1 c1Var = (c1) this.f155116b;
                Intrinsics.checkNotNullParameter(msg, "msg");
                String string = msg.getData().getString("external_biometric_token");
                if (string == null) {
                    c1Var.b(new NoSuchElementException("No biometric token found for the given user hash in external storage"));
                    return;
                } else {
                    c1Var.onNext(string);
                    c1Var.onComplete();
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c1 c1Var, Looper looper) {
        super(looper);
        this.f155116b = c1Var;
    }
}
