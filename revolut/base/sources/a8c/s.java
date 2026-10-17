package a8c;

import android.content.Intent;
import com.revolut.feature.revolutpay.impl.R$string;
import com.revolut.kompot.navigable.flow.BaseFlow;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements b {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseFlow f2178a;

    public s(BaseFlow flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f2178a = flow;
    }

    public static JSONObject b(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("status", str).put("orderToken", str2);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    @Override // a8c.b
    public final void a(j result) throws JSONException {
        String strName;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof i) {
            i iVar = (i) result;
            String str = iVar.f2165a;
            String str2 = iVar.f2166b;
            if (str2 != null) {
                JSONObject jSONObjectPut = b("success", str).put("paymentToken", str2);
                Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
                c(jSONObjectPut);
                return;
            } else {
                JSONObject jSONObjectPut2 = b("failure", str).put("reason", "MISSING_PAYMENT_TOKEN");
                Intrinsics.checkNotNullExpressionValue(jSONObjectPut2, "put(...)");
                c(jSONObjectPut2);
                return;
            }
        }
        if (result instanceof g) {
            JSONObject jSONObjectPut3 = b("cancel", ((g) result).f2162a).put("dropOffState", "payment_summary");
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut3, "put(...)");
            c(jSONObjectPut3);
            return;
        }
        if (result instanceof h) {
            h hVar = (h) result;
            String str3 = hVar.f2163a;
            u6c.k kVar = hVar.f2164b;
            if (kVar == null || (strName = kVar.name()) == null) {
                strName = "UNKNOWN_PAYMENT_ERROR";
            }
            JSONObject jSONObjectPut4 = b("failure", str3).put("reason", strName);
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut4, "put(...)");
            c(jSONObjectPut4);
            return;
        }
        boolean z = result instanceof e;
        BaseFlow baseFlow = this.f2178a;
        if (z) {
            baseFlow.m2().setResult(0);
            baseFlow.m2().finish();
        } else {
            if (!(result instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            baseFlow.m2().setResult(0);
            baseFlow.m2().finish();
        }
    }

    public final void c(JSONObject jSONObject) {
        BaseFlow baseFlow = this.f2178a;
        String string = baseFlow.m2().getString(R$string.web_payment_method_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Intent intent = new Intent();
        intent.putExtra("methodName", string);
        intent.putExtra("details", jSONObject.toString());
        baseFlow.m2().setResult(-1, intent);
        baseFlow.m2().finish();
    }
}
