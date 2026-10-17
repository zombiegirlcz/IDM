package bp0;

import android.text.InputFilter;
import androidx.core.text.BidiFormatter;
import java.math.RoundingMode;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qd0.b f17502b;

    public /* synthetic */ k(qd0.b bVar, int i) {
        this.f17501a = i;
        this.f17502b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f17501a;
        qd0.b bVar = this.f17502b;
        switch (i) {
            case 0:
                return Boolean.valueOf(jh.d.j(((s80.b) bVar).b()));
            case 1:
                return BidiFormatter.getInstance(((s80.b) bVar).b());
            case 2:
                return zhm.v.k(new InputFilter.LengthFilter(32), new epg.a(((s80.b) bVar).a()));
            case 3:
                DecimalFormat decimalFormat = new DecimalFormat("#.#", DecimalFormatSymbols.getInstance(((s80.b) bVar).b()));
                decimalFormat.setRoundingMode(RoundingMode.HALF_DOWN);
                decimalFormat.setMinimumFractionDigits(0);
                decimalFormat.setMaximumFractionDigits(2);
                return decimalFormat;
            case 4:
                return new DateFormatSymbols(((s80.b) bVar).b());
            default:
                return zhm.v.k(new InputFilter.LengthFilter(32), new epg.a(((s80.b) bVar).a()));
        }
    }
}
