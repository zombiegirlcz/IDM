package tcg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ RowDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a f269810w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(RowDelegate.Model model, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = model;
        this.f269810w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x(this.v, this.f269810w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.I2(r9, r10) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.J2(r9, r11, r10) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.L2(r9, r11, r10) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
    
        if (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.K2(r9, r11, r10) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d5, code lost:
    
        if (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.M2(r9, r11, r10) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tcg.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
