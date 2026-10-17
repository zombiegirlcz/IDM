package com.fourthline.orca.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class z21 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f35507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SoftwareKeyboardController f35508c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, SoftwareKeyboardController softwareKeyboardController, Continuation continuation) {
            super(2, continuation);
            this.f35507b = list;
            this.f35508c = softwareKeyboardController;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f35507b, this.f35508c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f35506a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            FocusRequester.m1781requestFocus3ESFkO8$default((FocusRequester) this.f35507b.get(0), 0, 1, null);
            SoftwareKeyboardController softwareKeyboardController = this.f35508c;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.show();
            }
            return Unit.f186387a;
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f35510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35511c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, int i, Continuation continuation) {
            super(2, continuation);
            this.f35510b = list;
            this.f35511c = i;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f35510b, this.f35511c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f35509a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            FocusRequester.m1781requestFocus3ESFkO8$default((FocusRequester) this.f35510b.get(this.f35511c), 0, 1, null);
            return Unit.f186387a;
        }
    }

    public static final class c implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f35512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f35513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f35514c;
        final /* synthetic */ MutableState d;

        public c(int i, Function1 function1, List list, MutableState mutableState) {
            this.f35512a = i;
            this.f35513b = function1;
            this.f35514c = list;
            this.d = mutableState;
        }

        public final Boolean a(KeyEvent keyEvent) {
            Intrinsics.checkNotNullParameter(keyEvent, "$v$c$androidx-compose-ui-input-key-KeyEvent$-event$0");
            boolean z = false;
            if (KeyEventType.m2391equalsimpl0(KeyEvent_androidKt.m2396getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m2392getKeyDownCS__XNY()) && Key.m2352equalsimpl0(KeyEvent_androidKt.m2395getKeyZmokQxo(keyEvent), Key.INSTANCE.m2356getBackspaceEK5gGoQ())) {
                if (((CharSequence) z21.a(this.d).get(this.f35512a)).length() > 0) {
                    MutableState mutableState = this.d;
                    ArrayList arrayListF1 = zhm.d0.f1(z21.a(mutableState));
                    arrayListF1.set(this.f35512a, "");
                    z21.a(mutableState, arrayListF1);
                    this.f35513b.invoke(zhm.d0.k0(z21.a(this.d), "", null, null, 0, null, 62));
                } else if (this.f35512a > 0) {
                    MutableState mutableState2 = this.d;
                    ArrayList arrayListF12 = zhm.d0.f1(z21.a(mutableState2));
                    arrayListF12.set(this.f35512a - 1, "");
                    z21.a(mutableState2, arrayListF12);
                    this.f35513b.invoke(zhm.d0.k0(z21.a(this.d), "", null, null, 0, null, 62));
                    FocusRequester.m1781requestFocus3ESFkO8$default((FocusRequester) this.f35514c.get(this.f35512a - 1), 0, 1, null);
                }
                z = true;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            return a(((androidx.compose.ui.input.key.KeyEvent) obj2).getNativeKeyEvent());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, VisualTransformation visualTransformation, Object obj2, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        a(modifier, visualTransformation, obj2, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r132, androidx.compose.ui.text.input.VisualTransformation r133, java.lang.Object r134, kotlin.jvm.functions.Function1 r135, final kotlin.jvm.functions.Function1 r136, androidx.compose.runtime.Composer r137, int r138, int r139) {
        /*
            Method dump skipped, instruction units count: 1449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.z21.a(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.VisualTransformation, java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean b(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState a(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("");
        }
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(arrayList, null, 2, null);
    }

    private static final void a(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, int i2, Function1 function1, int i3, List list, Function1 function12, SoftwareKeyboardController softwareKeyboardController, MutableState mutableState, String digit) {
        Intrinsics.checkNotNullParameter(digit, "digit");
        if (i != i2) {
            return Unit.f186387a;
        }
        if (digit.length() <= 1) {
            int i5 = 0;
            while (true) {
                if (i5 < digit.length()) {
                    if (!Character.isDigit(digit.charAt(i5))) {
                        break;
                    }
                    i5++;
                } else {
                    ArrayList arrayListF1 = zhm.d0.f1(a(mutableState));
                    arrayListF1.set(i, digit);
                    a(mutableState, arrayListF1);
                    function1.invoke(zhm.d0.k0(a(mutableState), "", null, null, 0, null, 62));
                    if (digit.length() > 0) {
                        if (i < i3 - 1) {
                            FocusRequester.m1781requestFocus3ESFkO8$default((FocusRequester) list.get(i + 1), 0, 1, null);
                        } else {
                            function12.invoke(zhm.d0.k0(a(mutableState), "", null, null, 0, null, 62));
                            if (softwareKeyboardController != null) {
                                softwareKeyboardController.hide();
                            }
                        }
                    }
                }
            }
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, SoftwareKeyboardController softwareKeyboardController, MutableState mutableState, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        function1.invoke(zhm.d0.k0(a(mutableState), "", null, null, 0, null, 62));
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, int i2, List list, MutableState mutableState, FocusState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        a(mutableState, state.isFocused());
        if (b(mutableState) && i != i2) {
            FocusRequester.m1781requestFocus3ESFkO8$default((FocusRequester) list.get(i2), 0, 1, null);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(MutableState mutableState) {
        return (List) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MutableState mutableState, List list) {
        mutableState.setValue(list);
    }
}
