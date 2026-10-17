package com.revolut.uicomponent.widgets.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.R$styleable;
import es.e;
import ezl.b;
import koi.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import v0.a;
import yhm.d;
import yy0.f;
import z4l.j;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR#\u0010\"\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/revolut/uicomponent/widgets/chip/ChipGroupView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lyy0/f;", "a", "Lyy0/f;", "getImageDisplayer", "()Lyy0/f;", "setImageDisplayer", "(Lyy0/f;)V", "imageDisplayer", "Lkotlin/Function1;", "Lezl/b;", "", "b", "Lkotlin/jvm/functions/Function1;", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "setClickListener", "(Lkotlin/jvm/functions/Function1;)V", "clickListener", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "e", "Lkotlin/Lazy;", "getChipsRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "chipsRecycler", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class ChipGroupView extends FrameLayout {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public f imageDisplayer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Function1 clickListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f107323c;
    public final j d;
    public final Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChipGroupView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(ChipGroupView chipGroupView) {
        Intrinsics.checkNotNullParameter(null, "model");
        int iIndexOf = chipGroupView.d.f319395l.indexOf(null);
        if (iIndexOf >= 0) {
            chipGroupView.getChipsRecycler().smoothScrollToPosition(iIndexOf);
        }
        chipGroupView.f107323c.onNext(null);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RecyclerView getChipsRecycler() {
        return (RecyclerView) this.e.getValue();
    }

    public final Function1<b, Unit> getClickListener() {
        return this.clickListener;
    }

    @NotNull
    public final f getImageDisplayer() {
        f fVar = this.imageDisplayer;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("imageDisplayer");
        throw null;
    }

    public final void setClickListener(Function1<? super b, Unit> function1) {
        this.clickListener = function1;
    }

    public final void setImageDisplayer(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.imageDisplayer = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChipGroupView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipGroupView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f107323c = a.d("create(...)");
        c cVar = new c(0);
        cVar.a(new ChipDelegate(new eu7.c(this, 22)));
        j jVar = new j(cVar, false, 14);
        this.d = jVar;
        this.e = w.y0(new e(this, 10));
        View.inflate(context, R$layout.view_chip_group, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ChipGroupView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.ChipGroupView_cgv_chipsSpacing, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes.recycle();
        getChipsRecycler().setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setPadding(0, 0, 0, 0);
        getChipsRecycler().setLayoutManager(new LinearLayoutManager(context, 0, false));
        getChipsRecycler().setAdapter(jVar);
        getChipsRecycler().addItemDecoration(new tw0.c(kli.a.z((int) dimension, context)));
    }

    public /* synthetic */ ChipGroupView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
