package zml;

import android.content.Intent;
import android.os.Bundle;
import com.revolut.kompot.navigable.flow.BaseFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseFlow f323624a;

    public g(BaseFlow flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f323624a = flow;
    }

    public final void a(Bundle bundle) {
        BaseFlow baseFlow = this.f323624a;
        if (bundle == null) {
            baseFlow.m2().setResult(0);
        } else {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            baseFlow.m2().setResult(0, intent);
        }
        baseFlow.m2().finish();
    }
}
