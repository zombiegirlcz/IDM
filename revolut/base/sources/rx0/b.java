package rx0;

import com.revolut.core.ui_kit.views.input.InputText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputText f257997b;

    public /* synthetic */ b(InputText inputText, int i) {
        this.f257996a = i;
        this.f257997b = inputText;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f257996a) {
            case 0:
                return InputText.i0(this.f257997b);
            case 1:
                final InputText inputText = this.f257997b;
                final int i = 1;
                return InputText.t0(inputText.f59098n0, new Function1() { // from class: rx0.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i2 = i;
                        float fFloatValue = ((Float) obj2).floatValue();
                        switch (i2) {
                            case 0:
                                return InputText.h0(inputText, fFloatValue);
                            default:
                                return InputText.m0(inputText, fFloatValue);
                        }
                    }
                });
            case 2:
                final InputText inputText2 = this.f257997b;
                final int i2 = 0;
                return InputText.t0(inputText2.f59099o0, new Function1() { // from class: rx0.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i22 = i2;
                        float fFloatValue = ((Float) obj2).floatValue();
                        switch (i22) {
                            case 0:
                                return InputText.h0(inputText2, fFloatValue);
                            default:
                                return InputText.m0(inputText2, fFloatValue);
                        }
                    }
                });
            default:
                return Float.valueOf(InputText.f0(this.f257997b));
        }
    }
}
