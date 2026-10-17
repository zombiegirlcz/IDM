package qrk;

import elm.f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import lhk.a0;
import lrk.r;
import skm.e0;
import skm.p0;
import ue0.e;
import wim.z;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f248738a;

    public d(r widgetDismissStatusRepository) {
        Intrinsics.checkNotNullParameter(widgetDismissStatusRepository, "widgetDismissStatusRepository");
        this.f248738a = widgetDismissStatusRepository;
    }

    public final a44.c a(tqk.a widgetType, String id10) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(id10, "id");
        r rVar = this.f248738a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(id10, "id");
        return new a44.c(e.R(rVar.f199549a, com.google.android.gms.internal.mlkit_vision_face.a.o(widgetType.name(), "_", id10), z.d(o0.b(Boolean.TYPE))), 9);
    }

    public final Object b(tqk.a aVar, String str, gim.c cVar) {
        r rVar = this.f248738a;
        rVar.getClass();
        a0 a0Var = new a0(rVar, aVar, str, null, 7);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, a0Var, cVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }
}
