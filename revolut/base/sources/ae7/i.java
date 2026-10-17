package ae7;

import a08.s;
import a09.z;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.PhotoDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.na;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.image_picker.R$string;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import efm.d0;
import efm.r;
import efm.w;
import ip0.u00;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.p0;
import rp0.y;
import sri.m;
import zhm.a0;
import zhm.q0;
import zkm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements zd7.b {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final upi.f f3492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80.c f3493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4l.a f3494c;
    public final aqi.a d;
    public final j e;
    public final m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rp0.m f3495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p0 f3496h;
    public final RowDelegate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PhotoDelegate f3497j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v60.i f3498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v60.i f3499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v60.i f3500n;
    public final CoroutineScope o;

    public i(upi.f mediaPickerView, t80.c mediaPickerConfiguration, d4l.a toastView, aqi.a permissionView, j itemsProvider, m navigator) {
        Intrinsics.checkNotNullParameter(mediaPickerView, "mediaPickerView");
        Intrinsics.checkNotNullParameter(mediaPickerConfiguration, "mediaPickerConfiguration");
        Intrinsics.checkNotNullParameter(toastView, "toastView");
        Intrinsics.checkNotNullParameter(permissionView, "permissionView");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        rp0.m expandableDialogDisplayer = new rp0.m();
        p0 promptDialogDisplayer = new p0();
        Intrinsics.checkNotNullParameter(mediaPickerView, "mediaPickerView");
        Intrinsics.checkNotNullParameter(mediaPickerConfiguration, "mediaPickerConfiguration");
        Intrinsics.checkNotNullParameter(toastView, "toastView");
        Intrinsics.checkNotNullParameter(permissionView, "permissionView");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(expandableDialogDisplayer, "expandableDialogDisplayer");
        Intrinsics.checkNotNullParameter(promptDialogDisplayer, "promptDialogDisplayer");
        this.f3492a = mediaPickerView;
        this.f3493b = mediaPickerConfiguration;
        this.f3494c = toastView;
        this.d = permissionView;
        this.e = itemsProvider;
        this.f = navigator;
        this.f3495g = expandableDialogDisplayer;
        this.f3496h = promptDialogDisplayer;
        this.i = new RowDelegate(null, null, 7);
        this.f3497j = new PhotoDelegate();
        this.f3498l = new v60.i();
        this.f3499m = new v60.i();
        this.f3500n = new v60.i();
        skm.p0 p0Var = skm.p0.f264001a;
        this.o = rd0.e.a(o.f323119a.e);
    }

    public final void a(BaseDelegatesActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        p0 p0Var = this.f3496h;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        p0Var.f256147a.e(activity);
        rp0.m mVar = this.f3495g;
        mVar.e(activity);
        mVar.i(new a2g.a(this, 11));
        r rVarH = mVar.h();
        a aVar = new a(this, 0);
        r rVarOnErrorResumeNext = rVarH.onErrorResumeNext(new s(1, new a2i.j(new BreadcrumbException(), 13)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new a08.r(3, aVar), new a08.r(3, h.f3491a)), "subscribe(...)");
    }

    public final r b() {
        r rVarHide = this.f3498l.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    public final void c(zd7.a configuration) {
        boolean z;
        y80.d dVar;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        boolean z3 = configuration.e;
        boolean z4 = this.k;
        upi.f fVar = this.f3492a;
        if (!z4) {
            this.k = true;
            r rVarD = this.f3496h.d();
            a aVar = new a(this, 1);
            r rVarOnErrorResumeNext = rVarD.onErrorResumeNext(new s(1, new a2i.j(new BreadcrumbException(), 8)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new a08.r(3, aVar), new a08.r(3, c.f3486a)), "subscribe(...)");
            ihm.f fVar2 = this.i.f53218h;
            a6j.a aVar2 = new a6j.a(this, z3, 3);
            r rVarOnErrorResumeNext2 = fVar2.onErrorResumeNext(new s(1, new a2i.j(new BreadcrumbException(), 9)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2.subscribe(new a08.r(3, aVar2), new a08.r(3, d.f3487a)), "subscribe(...)");
            ihm.f fVar3 = this.f3497j.f52920c;
            a aVar3 = new a(this, 2);
            r rVarOnErrorResumeNext3 = fVar3.onErrorResumeNext(new s(1, new a2i.j(new BreadcrumbException(), 10)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3.subscribe(new a08.r(3, aVar3), new a08.r(3, e.f3488a)), "subscribe(...)");
            ihm.j jVar = ((upi.b) fVar).k;
            a aVar4 = new a(this, 3);
            r rVarOnErrorResumeNext4 = jVar.onErrorResumeNext(new s(1, new a2i.j(new BreadcrumbException(), 11)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4.subscribe(new a08.r(3, aVar4), new a08.r(3, f.f3489a)), "subscribe(...)");
        }
        boolean z6 = configuration.f321319a;
        boolean z11 = configuration.f321320b;
        List customButtons = configuration.f321321c;
        u00 cameraSide = configuration.d;
        boolean zF = xam.a.f(((upi.b) fVar).f282057j.f268782b, new Intent("android.media.action.IMAGE_CAPTURE"));
        this.e.getClass();
        Intrinsics.checkNotNullParameter(customButtons, "customButtons");
        Intrinsics.checkNotNullParameter(cameraSide, "cameraSide");
        ArrayList arrayList = new ArrayList();
        if (zF) {
            na naVar = new na("ID_CAMERA", new PhotoDelegate.a.C0417a(cameraSide));
            yp0.b.l(naVar, 0, 0, 0, 0, null, false, 63);
            arrayList.add(naVar);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new RowDelegate.Model("ID_FROM_GALLERY", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_image, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.photo_picker_sources_gallery, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        if (z11) {
            arrayList2.add(new RowDelegate.Model("ID_FROM_DOCS", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.photo_picker_sources_document, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        }
        if (!customButtons.isEmpty()) {
            a0.x(customButtons, arrayList2);
        }
        if (z6) {
            arrayList2.add(new RowDelegate.Model("ID_REMOVE", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.image_picker_sheet_action_remove, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        }
        int i = R$attr.uikit_dp24;
        yp0.b.k(arrayList2, i, i, 0, 0, 28);
        a0.x(arrayList2, arrayList);
        y yVar = new y(arrayList, null, l.WINDOW, null, null, null, "MEDIA_PICKER_BOTTOM_DIALOG_DELEGATE_KEY", null, null, null, 3834);
        rp0.m mVar = this.f3495g;
        if (mVar.a()) {
            mVar.m(yVar);
            return;
        }
        mVar.k(yVar);
        aqi.d dVar2 = (aqi.d) this.d;
        dVar2.getClass();
        Activity activity = dVar2.f8464h;
        y80.b bVar = dVar2.i;
        Intrinsics.checkNotNullParameter("android.permission.CAMERA", "permission");
        bVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter("android.permission.CAMERA", "permissionName");
        if (ContextCompat.checkSelfPermission(activity, "android.permission.CAMERA") == 0) {
            dVar = y80.d.GRANTED;
            z = false;
        } else {
            boolean zShouldShowRequestPermissionRationale = ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.CAMERA");
            z = false;
            SharedPreferences sharedPreferences = activity.getSharedPreferences("permissions_requesting", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            dVar = (zShouldShowRequestPermissionRationale || !sharedPreferences.getBoolean("android.permission.CAMERA", false)) ? y80.d.DENIED : y80.d.DENIED_PERMANENTLY;
        }
        if (dVar == y80.d.GRANTED) {
            z = true;
        }
        String[] permissions = {"android.permission.CAMERA"};
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        final boolean z12 = true;
        final String[] strArr = (String[]) Arrays.copyOf(permissions, 1);
        bVar.b(activity, (String[]) Arrays.copyOf(strArr, strArr.length), 1001);
        d0 d0VarFirstOrError = dVar2.f8465j.startWith(new w() { // from class: aqi.b
            @Override // efm.w
            public final void subscribe(efm.y observer) {
                Intrinsics.checkNotNullParameter(observer, "observer");
                if (!z12) {
                    String[] strArr2 = strArr;
                    int iB = q0.b(strArr2.length);
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (String str : strArr2) {
                        linkedHashMap.put(str, y80.d.GRANTED);
                    }
                    observer.onNext(new g(1001, new y80.c(linkedHashMap, false)));
                }
                observer.onComplete();
            }
        }).filter(new aoa.h(new aqb.s(15), 6)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        z zVar = new z(this, configuration, z, 4);
        s sVar = new s(1, new a2i.j(new BreadcrumbException(), 12));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, sVar, 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        ofm.i iVar2 = new ofm.i(new a08.r(3, zVar), new a08.r(3, g.f3490a), 0);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
    }
}
