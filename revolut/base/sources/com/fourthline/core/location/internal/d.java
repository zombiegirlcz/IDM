package com.fourthline.core.location.internal;

import android.content.Context;
import android.graphics.Rect;
import android.location.Location;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.view.compose.ManagedActivityResultLauncher;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.Gender;
import com.fourthline.kyc.EmploymentStatus;
import com.fourthline.kyc.Industry;
import com.fourthline.kyc.internal.g;
import com.fourthline.vision.internal.e5;
import com.fourthline.vision.internal.l0;
import com.fourthline.vision.internal.m0;
import com.fourthline.vision.internal.oc;
import com.fourthline.vision.internal.rd;
import com.fourthline.vision.internal.v1;
import com.fourthline.vision.internal.wf;
import com.fourthline.vision.internal.xf;
import com.fourthline.vision.internal.yf;
import com.fourthline.vision.internal.za;
import io.ktor.utils.io.m;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kem.s;
import kem.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ub.f;
import ub.j;
import ub.l;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26449c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f26447a = i;
        this.f26448b = obj2;
        this.f26449c = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f26447a) {
            case 0:
                return LocationFetcherImpl.a((LocationFetcherImpl) this.f26448b, (SoftReference) this.f26449c, (Location) obj2);
            case 1:
                return Boolean.valueOf(e5.handleDetectedText$lambda$0((Rect) this.f26448b, (e5) this.f26449c, (com.google.mlkit.vision.text.a) obj2));
            case 2:
                return m0.createCameraSpecsOnReadyCallback$lambda$0((Context) this.f26448b, (String) this.f26449c, (l0) obj2);
            case 3:
                return oc.CameraXSelfieScanner$lambda$6$3$0((rd) this.f26448b, (za) this.f26449c, (l0) obj2);
            case 4:
                return v1.OnLifecycleEvent$lambda$0$0((State) this.f26448b, (State) this.f26449c, (DisposableEffectScope) obj2);
            case 5:
                return wf.VisionView$lambda$12$0((MutableState) this.f26448b, (xf) this.f26449c, (Lifecycle.Event) obj2);
            case 6:
                return wf.CameraPreview$lambda$2$0((WeakReference) this.f26448b, (xf) this.f26449c, (DisposableEffectScope) obj2);
            case 7:
                return yf.VisionXComposable$lambda$5$0$0((MutableState) this.f26448b, (Function1) this.f26449c, (IntSize) obj2);
            case 8:
                return yf.VisionXComposable$lambda$5$1$0$0((Function0) this.f26448b, (rd) this.f26449c, (DrawScope) obj2);
            case 9:
                return g.a((DeviceMetadata) this.f26448b, (String) this.f26449c, (com.fourthline.kyc.internal.e) obj2);
            case 10:
                return g.a((g) this.f26448b, (EmploymentStatus) this.f26449c, (com.fourthline.kyc.internal.e) obj2);
            case 11:
                return g.a((g) this.f26448b, (Industry) this.f26449c, (com.fourthline.kyc.internal.e) obj2);
            case 12:
                return g.a((g) this.f26448b, (Gender) this.f26449c, (com.fourthline.kyc.internal.e) obj2);
            case 13:
                m mVar = (m) this.f26448b;
                m mVar2 = (m) this.f26449c;
                Throwable th10 = (Throwable) obj2;
                if (th10 == null) {
                    return Unit.f186387a;
                }
                mVar.a(th10);
                mVar2.a(th10);
                return Unit.f186387a;
            case 14:
                ub.c cVar = (ub.c) this.f26448b;
                Function1 function1 = (Function1) this.f26449c;
                Map permissionsStatus = (Map) obj2;
                Intrinsics.checkNotNullParameter(permissionsStatus, "permissionsResult");
                cVar.getClass();
                Intrinsics.checkNotNullParameter(permissionsStatus, "permissionsStatus");
                for (String str : permissionsStatus.keySet()) {
                    Iterator it8 = cVar.f278707a.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((f) next).f278714a, str)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    f fVar = (f) next;
                    if (fVar != null && ((Boolean) permissionsStatus.get(str)) != null) {
                        j jVarA = fVar.a();
                        Intrinsics.checkNotNullParameter(jVarA, "<set-?>");
                        fVar.d.setValue(jVarA);
                    }
                }
                function1.invoke(permissionsStatus);
                return Unit.f186387a;
            case 15:
                ub.c cVar2 = (ub.c) this.f26448b;
                ManagedActivityResultLauncher managedActivityResultLauncher = (ManagedActivityResultLauncher) this.f26449c;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj2;
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                cVar2.e = managedActivityResultLauncher;
                return new ub.e(cVar2, 0);
            case 16:
                Lifecycle lifecycle = (Lifecycle) this.f26448b;
                LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) this.f26449c;
                DisposableEffectScope DisposableEffect2 = (DisposableEffectScope) obj2;
                Intrinsics.checkNotNullParameter(DisposableEffect2, "$this$DisposableEffect");
                lifecycle.addObserver(lifecycleEventObserver);
                return new l(lifecycle, lifecycleEventObserver);
            default:
                t tVar = (t) this.f26448b;
                nem.c cVar3 = (nem.c) this.f26449c;
                s buildHeaders = (s) obj2;
                Intrinsics.checkNotNullParameter(buildHeaders, "$this$buildHeaders");
                buildHeaders.e(tVar);
                buildHeaders.e(cVar3.c());
                return Unit.f186387a;
        }
    }
}
