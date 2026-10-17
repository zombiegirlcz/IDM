package p2k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.payments.bank_transfer.impl.new_zealand_transfer_note.NewZealandTransferNoteScreenContract$InputData;
import java.util.Set;
import p12.s0;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewZealandTransferNoteScreenContract$InputData f232394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f232395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f232396c;
    public final e4m.e d;

    public m(n nVar, i iVar, NewZealandTransferNoteScreenContract$InputData newZealandTransferNoteScreenContract$InputData) {
        this.f232395b = iVar;
        this.f232394a = newZealandTransferNoteScreenContract$InputData;
        int i = 5;
        this.f232396c = e4m.b.b(new s0(this, 1, i));
        this.d = e4m.b.b(new s0(this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f232395b.f232368s.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
