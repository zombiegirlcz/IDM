package knd;

import com.revolut.feature.categorisation.api.model.PeriodPreferenceType;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 extends gim.c {
    public lzi.h A;
    public /* synthetic */ Object B;
    public final /* synthetic */ kge.d C;
    public int D;
    public PeriodPreferenceType u;
    public DateTime v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public yld.d f186134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LocalDate f186135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public lzi.j f186136y;
    public lzi.i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(kge.d dVar, gim.c cVar) {
        super(cVar);
        this.C = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.z(null, null, null, null, this);
    }
}
