package com.fourthline.orca.internal;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.fourthline.core.DocumentType;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class vi1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34369c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vi1(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f34367a = i;
        this.f34368b = obj2;
        this.f34369c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f34367a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f34369c;
        Object obj6 = this.f34368b;
        switch (i) {
            case 0:
                return a80.a((Float) obj6, (r20) obj5, (String) obj4, (String) obj3, (SemanticsPropertyReceiver) obj2);
            case 1:
                return es0.a((List) obj6, (List) obj5, (List) obj4, (es0) obj3, (tr0) obj2);
            case 2:
                return zq.a((zq) obj6, (List) obj5, (String) obj4, (DocumentType) obj3, (sq) obj2);
            default:
                fem.e eVar = (fem.e) obj4;
                CoroutineContext coroutineContext = (CoroutineContext) obj3;
                try {
                    ((Ref$IntRef) obj6).f186408a = ((mmm.k) obj5).read((ByteBuffer) obj2);
                    return Unit.f186387a;
                } finally {
                    th = th;
                    try {
                        break;
                    } catch (Throwable th10) {
                    }
                }
        }
    }
}
