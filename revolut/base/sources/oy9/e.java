package oy9;

import com.revolut.data.model.Data;
import hd.r;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f230919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f230920c;

    public /* synthetic */ e(r rVar, String str, int i) {
        this.f230918a = i;
        this.f230919b = rVar;
        this.f230920c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String strSubstring;
        r rVar;
        switch (this.f230918a) {
            case 0:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                if (((List) data.getContent()) != null && (!r0.isEmpty())) {
                    efm.r rVarJust = efm.r.just(data);
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                    return rVarJust;
                }
                String str = this.f230920c;
                int iP = d0.P(str);
                while (true) {
                    if (-1 >= iP) {
                        strSubstring = str;
                    } else if (str.charAt(iP) != '@') {
                        iP--;
                    } else {
                        strSubstring = str.substring(iP + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                int i = 0;
                while (true) {
                    int length = strSubstring.length();
                    rVar = this.f230919b;
                    if (i < length) {
                        if (!Character.isDigit(strSubstring.charAt(i))) {
                            for (int i2 = 0; i2 < strSubstring.length(); i2++) {
                                if (Character.isLetterOrDigit(strSubstring.charAt(i2))) {
                                }
                            }
                            efm.r rVarSwitchMap = ((kgm.i) rVar.d).q(str).switchMap(new b(new e(rVar, str, 1), 8));
                            Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                            return rVarSwitchMap;
                        }
                        i++;
                    }
                }
                return rVar.C(str);
            default:
                List data2 = (List) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                if (data2.isEmpty()) {
                    return this.f230919b.C(this.f230920c);
                }
                efm.r rVarJust2 = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
                Intrinsics.checkNotNullExpressionValue(rVarJust2, "just(...)");
                return rVarJust2;
        }
    }
}
