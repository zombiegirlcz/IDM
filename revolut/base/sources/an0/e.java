package an0;

import aii.r;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.RemoteMessage;
import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel;
import java.util.Set;
import jng.l;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ljl.z1;
import mm0.n;
import mm0.o;
import od0.i;
import pfm.m;
import te0.s;
import yg0.b;
import yhm.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6542a;

    public /* synthetic */ e(int i) {
        this.f6542a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objZ;
        Object objA;
        switch (this.f6542a) {
            case 0:
                a0.d.B(obj2);
                f fVar = f.d;
                Intrinsics.checkNotNullParameter(null, "args");
                Intrinsics.checkNotNullExpressionValue(new b(), "factory(...)");
                throw null;
            case 1:
                Set it8 = (Set) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.isEmpty());
            case 2:
                yg0.b it9 = (yg0.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(!Intrinsics.f(it9, b.a.f313482a));
            case 3:
                Intrinsics.checkNotNullParameter((BaseStoriesModel) obj2, "it");
                return Unit.f186387a;
            case 4:
                Intrinsics.checkNotNullParameter((BaseStoriesModel) obj2, "it");
                return Unit.f186387a;
            case 5:
                Intrinsics.checkNotNullParameter((BaseStoriesModel) obj2, "it");
                return Unit.f186387a;
            case 6:
                Intrinsics.checkNotNullParameter((BaseStoriesModel) obj2, "it");
                return Unit.f186387a;
            case 7:
                Intrinsics.checkNotNullParameter((ru0.e) obj2, "it");
                return Unit.f186387a;
            case 8:
                Intrinsics.checkNotNullParameter((cj1.a) obj2, "<unused var>");
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((cj1.b) obj2, "<unused var>");
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((cn.a) obj2, "it");
                return m.f235744a;
            case 11:
                i it10 = (i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                cak.a aVar = (cak.a) it10.f224257a;
                objZ = aVar != null ? hx7.e.z(aVar) : null;
                i.Companion.getClass();
                return od0.h.a(objZ);
            case 12:
                Intrinsics.checkNotNullParameter((r) obj2, "it");
                return Unit.f186387a;
            case 13:
                e4e.a callback = (e4e.a) obj2;
                Intrinsics.checkNotNullParameter(callback, "callback");
                throw null;
            case 14:
                Context context = (Context) obj2;
                Intrinsics.checkNotNullParameter(context, "context");
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return new ex0.c(applicationContext);
            case 15:
                a0.d.B(obj2);
                Intrinsics.checkNotNullParameter(null, "args");
                throw null;
            case 16:
                gl0.b args = (gl0.b) obj2;
                gl0.c cVar = gl0.c.d;
                Intrinsics.checkNotNullParameter(args, "args");
                Context context2 = args.f144534a;
                context2.getClass();
                return new gl0.a(context2);
            case 17:
                o it11 = (o) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11 instanceof n);
            case 18:
                return Boolean.valueOf(((o) obj2) instanceof n);
            case 19:
                c8.o it12 = (c8.o) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12 instanceof wz0.b);
            case 20:
                RemoteMessage it13 = (RemoteMessage) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return czi.c.P(it13);
            case 21:
                hi0.c it14 = (hi0.c) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new hi0.b(it14);
            case 22:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return new hi0.c();
            case 23:
                i opt = (i) obj2;
                Intrinsics.checkNotNullParameter(opt, "opt");
                od0.h hVar = i.Companion;
                l lVar = (l) opt.f224257a;
                objZ = lVar != null ? com.bumptech.glide.c.B(lVar) : null;
                hVar.getClass();
                return od0.h.a(objZ);
            case 24:
                te0.e field = (te0.e) obj2;
                Intrinsics.checkNotNullParameter(field, "field");
                if (field instanceof te0.e) {
                    return field;
                }
                return null;
            case 25:
                te0.e field2 = (te0.e) obj2;
                Intrinsics.checkNotNullParameter(field2, "field");
                return field2.c(s.f270018a).map(new ir9.a(field2, 6));
            case 26:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj3 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                te0.e eVar = (te0.e) pair.f186386b;
                try {
                    m.Companion aVar2 = yhm.m.INSTANCE;
                    eVar.e(new Bundle(), obj3);
                    objA = Unit.f186387a;
                    break;
                } catch (Throwable th10) {
                    m.Companion aVar3 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                return new yhm.m(objA);
            case 27:
                yhm.m mVar = (yhm.m) obj2;
                Intrinsics.h(mVar);
                return yhm.m.a(mVar.f314193a);
            case 28:
                jjl.b args2 = (jjl.b) obj2;
                jjl.c cVar2 = jjl.c.d;
                Intrinsics.checkNotNullParameter(args2, "args");
                Context context3 = args2.f175015a;
                nn0.c cVar3 = args2.f175016b;
                th0.a aVar4 = args2.f175017c;
                cVar3.getClass();
                aVar4.getClass();
                return new jjl.a(new z1(), cVar3, aVar4, context3);
            default:
                Intrinsics.checkNotNullParameter((r) obj2, "it");
                return Unit.f186387a;
        }
    }
}
