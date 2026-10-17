package yrb;

import com.revolut.data.model.Data;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import nel.s0;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bfl.g f316252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qrb.b f316253c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final w f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f316254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f316255h;
    public final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s0 f316256j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f316257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f316258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j0b.e f316259n;
    public final Data o;

    public x(String str, bfl.g tradeSide, qrb.b inputType, BigDecimal inputValue, BigDecimal convertedInputValue, w sliderData, boolean z, Data data, Map marketAvailabilityPerRefMap, s0 s0Var, Data data2, Data data3, Data validationResult, j0b.e formState, Data data4) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(convertedInputValue, "convertedInputValue");
        Intrinsics.checkNotNullParameter(sliderData, "sliderData");
        Intrinsics.checkNotNullParameter(marketAvailabilityPerRefMap, "marketAvailabilityPerRefMap");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        Intrinsics.checkNotNullParameter(formState, "formState");
        this.f316251a = str;
        this.f316252b = tradeSide;
        this.f316253c = inputType;
        this.d = inputValue;
        this.e = convertedInputValue;
        this.f = sliderData;
        this.f316254g = z;
        this.f316255h = data;
        this.i = marketAvailabilityPerRefMap;
        this.f316256j = s0Var;
        this.k = data2;
        this.f316257l = data3;
        this.f316258m = validationResult;
        this.f316259n = formState;
        this.o = data4;
    }

    public static x a(x xVar, String str, bfl.g gVar, qrb.b bVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, w wVar, boolean z, Data data, Map map, s0 s0Var, Data data2, Data data3, Data data4, j0b.e eVar, Data data5, int i) {
        String str2 = (i & 1) != 0 ? xVar.f316251a : str;
        bfl.g tradeSide = (i & 2) != 0 ? xVar.f316252b : gVar;
        qrb.b inputType = (i & 4) != 0 ? xVar.f316253c : bVar;
        BigDecimal inputValue = (i & 8) != 0 ? xVar.d : bigDecimal;
        BigDecimal convertedInputValue = (i & 16) != 0 ? xVar.e : bigDecimal2;
        w sliderData = (i & 32) != 0 ? xVar.f : wVar;
        boolean z3 = (i & 64) != 0 ? xVar.f316254g : z;
        Data data6 = (i & 128) != 0 ? xVar.f316255h : data;
        Map marketAvailabilityPerRefMap = (i & 256) != 0 ? xVar.i : map;
        s0 s0Var2 = (i & 512) != 0 ? xVar.f316256j : s0Var;
        Data data7 = (i & 1024) != 0 ? xVar.k : data2;
        Data data8 = (i & 2048) != 0 ? xVar.f316257l : data3;
        Data validationResult = (i & 4096) != 0 ? xVar.f316258m : data4;
        j0b.e formState = (i & 8192) != 0 ? xVar.f316259n : eVar;
        Data data9 = (i & 16384) != 0 ? xVar.o : data5;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(convertedInputValue, "convertedInputValue");
        Intrinsics.checkNotNullParameter(sliderData, "sliderData");
        Intrinsics.checkNotNullParameter(marketAvailabilityPerRefMap, "marketAvailabilityPerRefMap");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        Intrinsics.checkNotNullParameter(formState, "formState");
        return new x(str2, tradeSide, inputType, inputValue, convertedInputValue, sliderData, z3, data6, marketAvailabilityPerRefMap, s0Var2, data7, data8, validationResult, formState, data9);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f316251a, xVar.f316251a) && this.f316252b == xVar.f316252b && this.f316253c == xVar.f316253c && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && this.f316254g == xVar.f316254g && Intrinsics.f(this.f316255h, xVar.f316255h) && Intrinsics.f(this.i, xVar.i) && Intrinsics.f(this.f316256j, xVar.f316256j) && Intrinsics.f(this.k, xVar.k) && Intrinsics.f(this.f316257l, xVar.f316257l) && Intrinsics.f(this.f316258m, xVar.f316258m) && this.f316259n == xVar.f316259n && Intrinsics.f(this.o, xVar.o);
    }

    public final int hashCode() {
        String str = this.f316251a;
        int iC = j6.a.c((this.f.hashCode() + t61.a.d(this.e, t61.a.d(this.d, (this.f316253c.hashCode() + wp5.y.b(this.f316252b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31, 31), 31)) * 31, 31, this.f316254g);
        Data data = this.f316255h;
        int iE = p.a.e((iC + (data == null ? 0 : data.hashCode())) * 31, 31, this.i);
        s0 s0Var = this.f316256j;
        int iHashCode = (iE + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        Data data2 = this.k;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f316257l;
        int iHashCode3 = (this.f316259n.hashCode() + kii.e.c(this.f316258m, (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31, 31)) * 31;
        Data data4 = this.o;
        return iHashCode3 + (data4 != null ? data4.hashCode() : 0);
    }
}
