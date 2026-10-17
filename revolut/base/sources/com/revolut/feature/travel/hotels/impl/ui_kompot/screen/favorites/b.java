package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites;

import android.os.Parcelable;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.TravelHotelsHomeFavoritesScreenContract$UndoAction;
import com.youTransactor.uCube.rpc.Constants;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pfm.r;
import rp0.k1;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Parcelable f93921w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Parcelable parcelable, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f93921w = parcelable;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f93921w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVarA = dVar.o.a(((TravelHotelsHomeFavoritesScreenContract$UndoAction.Stay) this.f93921w).f93919a);
            this.u = 1;
            if (nim.a.a(rVarA, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ((k1) dVar.f93923p).d(new ShotDialogDisplayer$Configuration("FAVORITE_DIALOG_ITEM_ID", new TextLocalisedClause(R$string.hotels_favourites_clipboard_banner_added_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_heart, (Integer) null, (Integer) null, new Integer(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        return Unit.f186387a;
    }
}
