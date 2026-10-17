package moi;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mn.b;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f207659a;

    public a() {
        k9 value = k9.SSO;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Pair pair = new Pair("com.google.android.gms.common.api.internal", com.google.android.gms.internal.mlkit_vision_face.a.h(value, "value", value));
        Intrinsics.checkNotNullParameter(value, "value");
        Pair pair2 = new Pair("com.google.android.gms.auth.api.signin.internal", new AnalyticsProduct.Retail(value));
        k9 value2 = k9.KYC;
        Pair pair3 = new Pair("com.onfido.android.sdk", com.google.android.gms.internal.mlkit_vision_face.a.h(value2, "value", value2));
        Intrinsics.checkNotNullParameter(value2, "value");
        Pair pair4 = new Pair("com.incode.welcome_sdk", new AnalyticsProduct.Retail(value2));
        Intrinsics.checkNotNullParameter(value2, "value");
        this.f207659a = r0.k(pair, pair2, pair3, pair4, new Pair("io.idnow.android.eid", new AnalyticsProduct.Retail(value2)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // mn.b
    public final Map a() {
        return this.f207659a;
    }
}
