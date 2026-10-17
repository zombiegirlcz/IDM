package ha8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior.isa.impl.ui.child_picker.JuniorIsaChildPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorIsaChildPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JuniorIsaChildPickerScreen juniorIsaChildPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorIsaChildPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[EDGE_INSN: B:27:0x008d->B:28:0x0092 BREAK  A[LOOP:0: B:21:0x0076->B:33:?]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.u
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            com.revolut.feature.junior.isa.impl.ui.child_picker.JuniorIsaChildPickerScreen r5 = r4.v
            java.lang.Object r5 = r5.Q
            java.lang.Object r5 = r5.getValue()
            ha8.f r5 = (ha8.f) r5
            kotlin.jvm.internal.Intrinsics.h(r0)
            ha8.i r5 = (ha8.i) r5
            r5.getClass()
            java.lang.String r1 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = r0.f53228a
            java.lang.String r2 = "CREATE_KID_ACTION_ID"
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            r3 = 0
            if (r2 == 0) goto L34
            com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination$JISAChildCreationDestination r0 = new com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination$JISAChildCreationDestination
            r0.<init>(r3)
            r5.C1(r0)
            goto L95
        L34:
            java.lang.Object r0 = r0.u
            boolean r2 = r0 instanceof com.revolut.feature.junior_profile.api.models.a
            if (r2 == 0) goto L3d
            com.revolut.feature.junior_profile.api.models.a r0 = (com.revolut.feature.junior_profile.api.models.a) r0
            goto L3e
        L3d:
            r0 = r3
        L3e:
            if (r0 != 0) goto L51
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Parcel is not JuniorProfile"
            r5.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r3, r3, r5, r0)
            goto L95
        L51:
            boolean r2 = r0 instanceof com.revolut.feature.junior_profile.api.models.c
            if (r2 == 0) goto L8d
            com.revolut.feature.junior_profile.api.models.c r0 = (com.revolut.feature.junior_profile.api.models.c) r0
            java.util.List r0 = r0.f77119j
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L8d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L72
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L72
            goto L87
        L72:
            java.util.Iterator r0 = r0.iterator()
        L76:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L87
            java.lang.Object r2 = r0.next()
            com.revolut.feature.junior_profile.api.models.f r2 = (com.revolut.feature.junior_profile.api.models.f) r2
            boolean r2 = r2 instanceof com.revolut.feature.junior_profile.api.models.h
            if (r2 != 0) goto L76
            goto L8d
        L87:
            com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination$JISAChildCreationDestination r0 = new com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination$JISAChildCreationDestination
            r0.<init>(r1)
            goto L92
        L8d:
            com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination$ChildDetailsDestination r0 = new com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination$ChildDetailsDestination
            r0.<init>(r1)
        L92:
            r5.C1(r0)
        L95:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ha8.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
