package com.revolut.feature.restricted_access;

import aw0.o9;
import com.revolut.core.network.exceptions.NetworkException;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.restricted_access.api.FeatureNotAvailableDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kg.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import sri.m;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends fsi.c implements qf0.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qf0.c f82029h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f82030j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qf0.c exceptionsOverseer, m navigator, o gson) {
        super(new fsi.b("FeatureNotAvailableGuardian"));
        Intrinsics.checkNotNullParameter(exceptionsOverseer, "exceptionsOverseer");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f82029h = exceptionsOverseer;
        this.i = navigator;
        this.f82030j = gson;
    }

    @Override // qf0.a
    public final Object P(Exception exc2, Continuation continuation) {
        b bVar;
        if (exc2 instanceof NetworkException) {
            NetworkException networkException = (NetworkException) exc2;
            if (networkException.f51449b == 403) {
                String str = networkException.d;
                if (str == null || d0.W(str)) {
                    bVar = null;
                } else {
                    try {
                        bVar = (b) this.f82030j.c(str, b.class);
                    } catch (Exception unused) {
                        bVar = null;
                    }
                }
                if (bVar != null && bVar.getCode() == 90403) {
                    String deeplink = bVar.getDeeplink();
                    FeatureNotAvailableDestination.Action.OpenDeeplink openDeeplink = deeplink != null ? new FeatureNotAvailableDestination.Action.OpenDeeplink(deeplink, FeatureNotAvailableDestination.Action.NavigateToMain.f82021a) : null;
                    String title = bVar.getTitle();
                    TextClause textClause = title != null ? new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    String message = bVar.getMessage();
                    this.i.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new FeatureNotAvailableDestination(textClause, message != null ? new TextClause(message, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, (TextLocalisedClause) null, openDeeplink, openDeeplink, 36), false, (Integer) null, 335577088, 41)));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // fsi.a
    public final void onStart() {
        this.f82029h.b(this);
    }

    @Override // fsi.c, fsi.a
    public final void onStop() {
        super.onStop();
        this.f82029h.a(this);
    }
}
