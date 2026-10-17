package com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document;

import ba4.f;
import ba4.g;
import ba4.i;
import ba4.j;
import ba4.k;
import ba4.l;
import ba4.m;
import ba4.o;
import ba4.p;
import ba4.r;
import ba4.t;
import ba4.x;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.UploadScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import e60.s;
import ip0.u00;
import java.util.concurrent.CopyOnWriteArrayList;
import jz3.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import ny3.b;
import oki.h;
import org.jetbrains.annotations.NotNull;
import tqi.e;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements r {

    @NotNull
    private static final t Companion = new t();
    public final UploadScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jw3.a f67580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e60.a f67581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f67582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hk0.a f67583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f67584t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(UploadScreenContract$InputData inputData, jw3.a interactor, e60.a mediaPickerControllerExtension, c documentPreviewNavigationProvider, hk0.a networkFileRepository, e shareExternalDestinationFactory, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(documentPreviewNavigationProvider, "documentPreviewNavigationProvider");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(shareExternalDestinationFactory, "shareExternalDestinationFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f67580p = interactor;
        this.f67581q = mediaPickerControllerExtension;
        this.f67582r = documentPreviewNavigationProvider;
        this.f67583s = networkFileRepository;
        this.f67584t = shareExternalDestinationFactory;
        this.u = d.b(this, new f(0), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new b7d.c(this, 7));
    }

    public final void I2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof g;
        ba4.n nVar = ba4.n.f13905a;
        e60.a aVar = this.f67581q;
        if (z) {
            if (((s) aVar).S()) {
                return;
            }
            C2(nVar);
            return;
        }
        if (event instanceof k) {
            C2(nVar);
            return;
        }
        Continuation continuation = null;
        if (event instanceof l) {
            Object obj2 = ((l) event).f13904a.d;
            if (obj2 instanceof ny3.c) {
                C2(new o(((ny3.c) obj2).f220626a));
                return;
            } else {
                if (obj2 instanceof b) {
                    n2(new av7.l(this, ((b) obj2).f220625a, continuation, 26), new whi.b(6));
                    return;
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "UploadScreenModel", "Unsupported event type: ".concat(l.class.getSimpleName()), null, h0Var);
                return;
            }
        }
        if (!(event instanceof i)) {
            if (!(event instanceof j)) {
                if (!(event instanceof ba4.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                C2(new p(new Pair(this.o.f67577b.f220629a, ((f) ((j2) this.u.f22677a).getValue()).f13898a)));
                return;
            }
            Object obj3 = ((j) event).f13902a.u;
            if (obj3 instanceof ry3.a) {
                h.v2(this.v, new UploadScreenContract$ModalStep.DocumentRemoveConfirmation((ry3.a) obj3), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return;
            } else {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "UploadScreenModel", "Unsupported event type: ".concat(j.class.getSimpleName()), null, h0Var2);
                return;
            }
        }
        RowDelegate.Model model = ((i) event).f13901a;
        Object obj4 = model.u;
        if (Intrinsics.f(model.f53228a, "add-document-item-id")) {
            ((s) aVar).T(new e60.i(null, null, null, true, 0, 0, null, null, false, u00.BACK, null, 15863));
        } else if (!(obj4 instanceof ry3.a)) {
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "UploadScreenModel", "Unsupported event type: ".concat(i.class.getSimpleName()), null, h0Var3);
        } else {
            this.f67582r.getClass();
            ParcelableDestination parcelableDestinationA = c.a((ry3.a) obj4);
            if (parcelableDestinationA != null) {
                C1(parcelableDestinationA);
            }
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        int i = 0;
        Continuation continuation = null;
        yji.l.b1(this, new x(this.f67580p.a(this.o.f67576a), this, i), null, new ba4.y(this, continuation, i), 3);
        yji.l.b1(this, rd0.e.b(((s) this.f67581q).f122868g), null, new ba4.y(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
