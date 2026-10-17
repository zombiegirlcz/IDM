package com.revolut.feature.chooser.external_map.screen;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.revolut.feature.chooser.external_map.screen.BottomChooserExternalMapAppScreenContract$ModalStep;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import q70.d;
import q70.e;
import yhm.o;
import zhm.d0;
import zi3.c;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ApplicationInfo applicationInfo;
        String str;
        b bVar = this.v;
        yi3.b bVar2 = bVar.o;
        c cVar = bVar.f65923r;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            q70.a aVar2 = bVar.f65921p;
            this.u = 1;
            PackageManager packageManager = ((q70.c) aVar2).f242733a;
            ?? r4 = q70.c.f242732b;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : r4.entrySet()) {
                String str2 = (String) entry.getKey();
                d dVar = (d) entry.getValue();
                try {
                    applicationInfo = packageManager.getApplicationInfo(str2, 128);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (!applicationInfo.enabled) {
                    applicationInfo = null;
                }
                e eVar = applicationInfo != null ? new e(applicationInfo.loadLabel(packageManager).toString(), str2, dVar) : null;
                if (eVar != null) {
                    arrayList.add(eVar);
                }
            }
            if (arrayList == aVar) {
                return aVar;
            }
            obj2 = arrayList;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        List list = (List) obj2;
        int size = list.size();
        if (size == 0) {
            double d = bVar2.f314227a;
            double d5 = bVar2.f314228b;
            gi0.a aVar3 = cVar.f322500a;
            int i2 = zi3.b.f322499b[gh0.d.GOOGLE.ordinal()];
            if (i2 == 1) {
                str = "https://www.google.com/maps/search/?api=1&query=" + d + "," + d5;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "https://www.petalmaps.com/routes/?daddr=" + d + "," + d5;
            }
            bVar.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, Uri.parse(str), 0, null, 490));
            bVar.B2();
        } else if (size != 1) {
            h.v2(bVar.f65924s, new BottomChooserExternalMapAppScreenContract$ModalStep.MapAppChooser(list), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            e eVar2 = (e) d0.b0(list);
            String str3 = eVar2.f242735b;
            d dVar2 = eVar2.f242736c;
            double d6 = bVar2.f314227a;
            double d10 = bVar2.f314228b;
            cVar.getClass();
            bVar.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", str3, Uri.parse(c.a(dVar2, d6, d10)), 0, null, 490));
            bVar.B2();
        }
        return Unit.f186387a;
    }
}
