package ix5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData;
import java.util.Set;
import mw5.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169342a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoSortingPickerInputData f169343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f169344c;
    public final e4m.e d;

    public c(d dVar, e eVar, CryptoSortingPickerInputData cryptoSortingPickerInputData) {
        this.f169343b = cryptoSortingPickerInputData;
        int i = 0;
        this.f169344c = e4m.b.b(new b(this, 1, i));
        this.d = e4m.b.b(new b(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f169342a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f169342a) {
        }
        return ImmutableSet.of();
    }

    public c(l lVar, CryptoSortingPickerInputData cryptoSortingPickerInputData) {
        this.f169343b = cryptoSortingPickerInputData;
        int i = 10;
        this.f169344c = e4m.b.b(new mil.a(this, 1, i));
        this.d = e4m.b.b(new mil.a(this, 0, i));
    }
}
