package xkg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import dam.m;
import dam.s;
import ihm.f;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f306810a = v0.a.d("create(...)");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws JSONException {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        try {
            String string = extras.getString("type");
            Intrinsics.h(string);
            m mVarValueOf = m.valueOf(string);
            String string2 = extras.getString("data");
            if (string2 == null) {
                string2 = "{}";
            }
            JSONObject data = new JSONObject(string2);
            String action = intent.getAction();
            s.Companion.getClass();
            if (!Intrinsics.f(action, "financial.atomic.transact.EVENT")) {
                String str = "Invalid Intent Action: " + intent.getAction();
                return;
            }
            int i = fam.a.f133412a[mVarValueOf.ordinal()];
            f fVar = this.f306810a;
            if (i == 1) {
                String reason = data.optString("reason");
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(data, "data");
                fVar.onNext(new b(data));
                Intrinsics.checkNotNullExpressionValue(reason, "reason");
                Intrinsics.checkNotNullParameter(reason, "reason");
                return;
            }
            if (i == 2) {
                String name = data.optString("name");
                JSONObject value = data.optJSONObject("value");
                if (value == null) {
                    value = new JSONObject();
                }
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                fVar.onNext(new d(name, value));
                return;
            }
            if (i == 3) {
                Intrinsics.checkNotNullParameter(data, "data");
                Uri url2 = Uri.parse(data.optString("url"));
                Intrinsics.checkNotNullExpressionValue(url2, "parse(data.optString(\"url\"))");
                Intrinsics.checkNotNullParameter(url2, "url");
                if (context != null) {
                    Intent intent2 = new Intent("android.intent.action.VIEW", url2);
                    intent2.setFlags(268435456);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("new_window", true);
                    intent2.putExtras(bundle);
                    context.startActivity(intent2);
                    return;
                }
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                String taskId = data.optString("taskId");
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(data, "data");
                fVar.onNext(new c(data));
                Intrinsics.checkNotNullExpressionValue(taskId, "taskId");
                Intrinsics.checkNotNullParameter(taskId, "taskId");
                return;
            }
            ArrayList fields = new ArrayList();
            JSONArray jSONArrayOptJSONArray = data.optJSONArray("fields");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string3 = jSONArrayOptJSONArray.getString(i2);
                Intrinsics.checkNotNullExpressionValue(string3, "fieldArray.getString(i)");
                fields.add(string3);
            }
            Intrinsics.checkNotNullParameter(data, "data");
            String taskId2 = data.optString("taskId");
            Intrinsics.checkNotNullExpressionValue(taskId2, "data.optString(\"taskId\")");
            String userId = data.optString("userId");
            Intrinsics.checkNotNullExpressionValue(userId, "data.optString(\"userId\")");
            String identifier = data.optString("identifier");
            Intrinsics.checkNotNullExpressionValue(identifier, "data.optString(\"identifier\")");
            Intrinsics.checkNotNullParameter(fields, "fields");
            Intrinsics.checkNotNullParameter(taskId2, "taskId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
        } catch (IllegalArgumentException e) {
        }
    }
}
