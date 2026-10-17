package k50;

import android.content.Context;
import android.view.View;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.tracking.v3.AirTipContext;
import java.util.List;
import jh.d;
import k50.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import py0.c;
import py0.f;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements bki.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181030c;

    public b(String tipId, String str, String str2) {
        Intrinsics.checkNotNullParameter(tipId, "tipId");
        this.f181028a = tipId;
        this.f181029b = str;
        this.f181030c = str2;
    }

    @Override // bki.a
    public final void a(final View controllerView, os2.g uiStateBlockHandle, hli.a blockUserInteractionHandle, cli.r transitionStateLatch) {
        Intrinsics.checkNotNullParameter(controllerView, "controllerView");
        Intrinsics.checkNotNullParameter(uiStateBlockHandle, "uiStateBlockHandle");
        Intrinsics.checkNotNullParameter(blockUserInteractionHandle, "blockUserInteractionHandle");
        Intrinsics.checkNotNullParameter(transitionStateLatch, "transitionStateLatch");
        controllerView.post(new Runnable() { // from class: com.revolut.chat.ui.messageslist.a
            @Override // java.lang.Runnable
            public final void run() {
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                AirTipContext.a aVarNewBuilder = AirTipContext.newBuilder();
                b bVar = this.f51194a;
                String str = bVar.f181028a;
                aVarNewBuilder.c();
                ((AirTipContext) aVarNewBuilder.f49761b).setId(str);
                String str2 = bVar.f181029b;
                if (str2 != null) {
                    aVarNewBuilder.c();
                    ((AirTipContext) aVarNewBuilder.f49761b).setType(str2);
                }
                String str3 = bVar.f181030c;
                if (str3 != null) {
                    aVarNewBuilder.c();
                    ((AirTipContext) aVarNewBuilder.f49761b).setTitle(str3);
                }
                w0 w0VarA = aVarNewBuilder.a();
                companion.getClass();
                w0 w0VarA2 = AnalyticsContext.Companion.a(w0VarA);
                View view = controllerView;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                f fVarN0 = d.f(context).n0();
                AnalyticsContext analyticsContext = new AnalyticsContext(w0VarA2);
                AirTipPropagationTrackableItem airTipPropagationTrackableItem = new AirTipPropagationTrackableItem();
                airTipPropagationTrackableItem.f51173a = analyticsContext;
                fVarN0.a(view, airTipPropagationTrackableItem, new c(new TextLocalisedClause("air_tip_chat_propagation", (List) null, (Clause) null, false, 30)));
            }
        });
    }
}
