package vnj;

import com.google.protobuf.b4;
import com.google.protobuf.d4;
import com.google.protobuf.f3;
import com.google.protobuf.h3;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.api.model.EsimProfileScope;
import com.revolut.tracking.v3.SettingsThirdPartySdkContext;
import dej.m;
import dej.n1;
import grl.cc;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    @NotNull
    public static final C1610a Companion = new C1610a();

    /* JADX INFO: renamed from: vnj.a$a, reason: collision with other inner class name */
    public static final class C1610a {
        private C1610a() {
        }
    }

    public static w0 a(EsimProfile esimProfile) {
        n1 n1Var;
        m mVar;
        Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
        String profileId = esimProfile.f100423a;
        EsimProfileScope esimProfileScope = esimProfile.f100428j;
        String strName = null;
        String strName2 = (esimProfileScope == null || (mVar = esimProfileScope.f100450a) == null) ? null : mVar.name();
        EsimProfileDetails esimProfileDetails = esimProfile.f100426g;
        if (esimProfileDetails != null && (n1Var = esimProfileDetails.f) != null) {
            strName = n1Var.name();
        }
        Intrinsics.checkNotNullParameter(profileId, "profileId");
        SettingsThirdPartySdkContext.a aVarNewBuilder = SettingsThirdPartySdkContext.newBuilder();
        cc ccVar = cc.Started;
        aVarNewBuilder.c();
        ((SettingsThirdPartySdkContext) aVarNewBuilder.f49761b).setEvent(ccVar);
        aVarNewBuilder.c();
        ((SettingsThirdPartySdkContext) aVarNewBuilder.f49761b).setVendor("system_esim");
        f3 f3VarNewBuilder = h3.newBuilder();
        b4 b4VarNewBuilder = d4.newBuilder();
        b4VarNewBuilder.h(profileId);
        f3VarNewBuilder.i("profileId", (d4) b4VarNewBuilder.a());
        if (strName2 != null) {
            b4 b4VarNewBuilder2 = d4.newBuilder();
            b4VarNewBuilder2.h(strName2);
            f3VarNewBuilder.i("mobilePlanType", (d4) b4VarNewBuilder2.a());
        }
        if (strName != null) {
            b4 b4VarNewBuilder3 = d4.newBuilder();
            b4VarNewBuilder3.h(strName);
            f3VarNewBuilder.i("installationType", (d4) b4VarNewBuilder3.a());
        }
        w0 w0VarA = f3VarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        aVarNewBuilder.c();
        ((SettingsThirdPartySdkContext) aVarNewBuilder.f49761b).setParameters((h3) w0VarA);
        SettingsThirdPartySdkContext settingsThirdPartySdkContext = (SettingsThirdPartySdkContext) aVarNewBuilder.a();
        AnalyticsContext.INSTANCE.getClass();
        return AnalyticsContext.Companion.a(settingsThirdPartySdkContext);
    }
}
