package yg4;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3l.a f313513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf0.h f313514b;

    public d(g3l.a statusViewConfigurationDispatcher, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(statusViewConfigurationDispatcher, "statusViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f313513a = statusViewConfigurationDispatcher;
        this.f313514b = serverErrorParser;
    }

    public final d0 a(a config, um.a errorData) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        if (errorData.f281172a instanceof qc0.f) {
            ServerError serverErrorA = this.f313514b.a(errorData.f281173b);
            if (serverErrorA != null && serverErrorA.f51362a == config.d) {
                return this.f313513a.c0(new StatusViewConfiguration.Error(config.f313509a, config.f313510b, config.f313511c, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, 8176)).D(Boolean.TRUE);
            }
        }
        return d0.m(Boolean.FALSE);
    }
}
