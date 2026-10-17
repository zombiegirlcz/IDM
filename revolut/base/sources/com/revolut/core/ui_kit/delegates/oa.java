package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.PhotoDelegate;
import io.fotoapparat.view.CameraView;
import ip0.ix;
import ip0.v00;
import ip0.w00;
import ip0.x00;
import ip0.y00;
import ip0.z00;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class oa extends koi.b implements LifecycleEventObserver, View.OnAttachStateChangeListener {
    public final AppCompatImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f54537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CameraView f54538h;
    public final w00 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w00 f54539j;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PhotoDelegate.a.C0417a f54540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public iam.e f54541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public zam.a f54542n;
    public Bitmap o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ofm.i f54543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f54544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference f54545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f54546s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v10, types: [ip0.w00] */
    /* JADX WARN: Type inference failed for: r0v11, types: [ip0.w00] */
    public oa(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cameraIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (AppCompatImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.backgroundImageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54537g = (AppCompatImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.backgroundCameraView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54538h = (CameraView) viewFindViewById3;
        final int i = 0;
        this.i = new Runnable(this) { // from class: ip0.w00

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.core.ui_kit.delegates.oa f166912b;

            {
                this.f166912b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f166912b.H();
                        break;
                    default:
                        this.f166912b.f54537g.setVisibility(8);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f54539j = new Runnable(this) { // from class: ip0.w00

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.core.ui_kit.delegates.oa f166912b;

            {
                this.f166912b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f166912b.H();
                        break;
                    default:
                        this.f166912b.f54537g.setVisibility(8);
                        break;
                }
            }
        };
        this.f54545r = new WeakReference(null);
        itemView.addOnAttachStateChangeListener(this);
    }

    public final void F() {
        boolean z = this.f54546s && this.f54540l != null;
        if (z != this.f54544q) {
            this.f54544q = z;
            if (z) {
                View itemView = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                or0.u.g(itemView).addObserver(this);
            } else {
                I();
                View itemView2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                or0.u.g(itemView2).removeObserver(this);
            }
        }
    }

    public final void H() {
        fbm.d dVarI;
        PhotoDelegate.a.C0417a c0417a = this.f54540l;
        iam.e eVar = null;
        if (c0417a == null) {
            c0417a = null;
        }
        if (this.f54541m != null || c0417a == null) {
            return;
        }
        Bitmap bitmap = this.o;
        int i = 0;
        if (bitmap != null) {
            this.f54537g.setVisibility(0);
            this.k = true;
            this.f54537g.setImageBitmap(bitmap);
        } else {
            this.k = false;
        }
        try {
            nam.b.Companion.getClass();
            nam.b bVarI = nam.b.i(nam.a.a(), new v00(this, i));
            int i2 = x00.f167079b[c0417a.f52921a.ordinal()];
            if (i2 == 1) {
                dVarI = cp5.d.i();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dVarI = new fbm.d(lam.b.f193471b, 1);
            }
            fbm.d dVar = dVarI;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iam.e eVar2 = new iam.e(context, this.f54538h, dVar, null, bVarI, null, null, 468);
            eVar2.a();
            eVar = eVar2;
        } catch (Exception e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        this.f54541m = eVar;
    }

    public final void I() {
        if (this.f54541m != null) {
            this.itemView.removeCallbacks(this.i);
            this.itemView.removeCallbacks(this.f54539j);
            this.k = false;
            iam.e eVar = this.f54541m;
            if (eVar != null) {
                eVar.b();
            }
            this.f54541m = null;
            ofm.i iVar = this.f54543p;
            if (iVar != null) {
                lfm.d.a(iVar);
            }
            PhotoDelegate.a.C0417a c0417a = this.f54540l;
            PhotoDelegate.a.C0417a c0417a2 = c0417a != null ? c0417a : null;
            zam.a aVar = this.f54542n;
            if (c0417a2 == null || aVar == null) {
                return;
            }
            ufm.c cVar = new ufm.c(new fag.g(this, aVar, c0417a2), 2);
            Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            ufm.f fVar = new ufm.f(o70.a.i(te0.w.e0(cVar)), new ix(23, new v00(this, 1)), 3);
            Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
            ufm.i iVar2 = new ufm.i(fVar, new fmc.z(new i2i.d0(new BreadcrumbException(), 21)), 2);
            Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
            ofm.i iVar3 = new ofm.i(new a08.r(25, y00.f167230a), new a08.r(25, z00.f167379a), 0);
            iVar2.q(iVar3);
            Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
            this.f54543p = iVar3;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = x00.f167078a[event.ordinal()];
        if (i == 1) {
            this.itemView.post(this.i);
        } else {
            if (i != 2) {
                return;
            }
            I();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(v, "v");
        this.f54546s = true;
        PhotoDelegate photoDelegate = (PhotoDelegate) this.f54545r.get();
        if (photoDelegate != null && (arrayList = photoDelegate.d) != null) {
            arrayList.add(this);
        }
        F();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(v, "v");
        this.f54546s = false;
        PhotoDelegate photoDelegate = (PhotoDelegate) this.f54545r.get();
        if (photoDelegate != null && (arrayList = photoDelegate.d) != null) {
            arrayList.remove(this);
        }
        F();
    }
}
