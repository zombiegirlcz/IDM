package com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.a;
import iii.c;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import ss4.a0;
import sxi.g;
import sxi.h;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungeDetailsScreenContract$InputData f99112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vxi.b f99113b;

    public b(AirportLoungeDetailsScreenContract$InputData inputData, vxi.a amenitiesItemMapper, wxi.a amenitiesTypeResolver, vxi.b informationItemsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amenitiesItemMapper, "amenitiesItemMapper");
        Intrinsics.checkNotNullParameter(amenitiesTypeResolver, "amenitiesTypeResolver");
        Intrinsics.checkNotNullParameter(informationItemsMapper, "informationItemsMapper");
        this.f99112a = inputData;
        this.f99113b = informationItemsMapper;
    }

    @Override // jki.p
    public final m a(i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        sxi.i iVar2 = domainState.f266500a;
        Data data = iVar2.f266504a;
        return new sxi.m((h) c.f(data, new sx8.a(this, 2), new suf.a(this, 8), new dbg.a(this, iVar2.f266505b, 3)), !this.f99112a.f99107b ? a.c.f99111a : (a) c.f(t1.t(data, iVar2.f266506c), new sx2.g(20), new a0(18), new sr8.a(4)), (List) c.f(data, new sx2.g(this), new a0(this, 17), new sa5.b(this, 18)));
    }

    public final List b() {
        String str = this.f99112a.f99108c;
        return str != null ? u.c(new UrlImage(str, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 524282)) : f0.f322471a;
    }
}
