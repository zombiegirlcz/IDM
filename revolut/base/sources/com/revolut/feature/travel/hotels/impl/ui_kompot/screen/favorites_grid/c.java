package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pfm.r;
import rcg.q;
import rp0.f1;
import rp0.k1;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f93935w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q qVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
        this.f93935w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f93935w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f93935w;
        q qVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVarB = qVar.o.b(str);
            this.u = 1;
            if (nim.a.a(rVarB, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ((k1) qVar.f253263p).d(ShotDialogDisplayer$Configuration.Companion.b(ShotDialogDisplayer$Configuration.INSTANCE, "FAVORITES_GRID_DIALOG", new TextLocalisedClause(R$string.hotels_favourites_clipboard_banner_removed_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_heart_outline, (Integer) null, (Integer) null, new Integer(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.hotels_common_action_undo, null, null, 14), null, f1.ABOVE_ANCHOR_VIEW, new UndoRemoveFavoriteParcel(str), SyslogConstants.LOG_LOCAL2));
        return Unit.f186387a;
    }
}
