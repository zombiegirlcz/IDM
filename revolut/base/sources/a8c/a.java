package a8c;

import android.content.Intent;
import com.revolut.kompot.navigable.flow.BaseFlow;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseFlow f2157a;

    public a(BaseFlow flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f2157a = flow;
    }

    @Override // a8c.b
    public final void a(j result) {
        String strName;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof i) {
            BaseFlow baseFlow = this.f2157a;
            baseFlow.m2().setResult(-1);
            baseFlow.m2().finish();
            return;
        }
        if (result instanceof g) {
            b(null);
            return;
        }
        if (result instanceof e) {
            b("APP_VERIFICATION_FAILED");
            return;
        }
        if (!(result instanceof h)) {
            if (!(result instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            b("DEEPLINK_PARSING_FAILED");
        } else {
            u6c.k kVar = ((h) result).f2164b;
            if (kVar == null || (strName = kVar.name()) == null) {
                strName = "UNKNOWN_PAYMENT_ERROR";
            }
            b(strName);
        }
    }

    public final void b(String str) {
        BaseFlow baseFlow = this.f2157a;
        if (str == null) {
            baseFlow.m2().setResult(0);
        } else {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_KEY_ERROR", str);
            baseFlow.m2().setResult(0, intent);
        }
        baseFlow.m2().finish();
    }
}
