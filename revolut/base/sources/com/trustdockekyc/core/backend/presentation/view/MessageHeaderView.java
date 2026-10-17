package com.trustdockekyc.core.backend.presentation.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u1m.g0;
import u2m.a;
import u2m.b;
import u2m.c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0018\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011R*\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/trustdockekyc/core/backend/presentation/view/MessageHeaderView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "", "setType", "(Ljava/lang/String;)V", "Lu2m/b;", "type", "(Lu2m/b;)V", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "message", "u2m/a", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MessageHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f107538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public String message;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.message = value;
        a aVar = this.f107538a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(value, "<set-?>");
        aVar.f276710a = value;
        aVar.a();
    }

    public final void setType(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setType(b.valueOf(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setType(@NotNull b type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i = c.f276713a[type.ordinal()];
        a aVar = this.f107538a;
        if (i == 1) {
            aVar.f276711b = null;
            aVar.f276712c.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.tdcoreekyc__green500));
            aVar.d.setTextColor(ContextCompat.getColor(getContext(), R.color.tdcoreekyc__white));
            aVar.a();
            return;
        }
        if (i == 2) {
            aVar.f276711b = null;
            aVar.f276712c.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.tdcoreekyc__grey100));
            aVar.d.setTextColor(ContextCompat.getColor(getContext(), R.color.tdcoreekyc__black));
            aVar.a();
            return;
        }
        if (i == 3) {
            aVar.f276711b = ResourcesCompat.getDrawable(getContext().getResources(), R.drawable.tdcoreekyc__ic_alert_transparent, null);
            aVar.f276712c.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.tdcoreekyc__red500));
            aVar.d.setTextColor(ContextCompat.getColor(getContext(), R.color.tdcoreekyc__white));
            aVar.a();
            return;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.f276711b = null;
        aVar.f276712c.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.tdcoreekyc__grey600));
        aVar.d.setTextColor(ContextCompat.getColor(getContext(), R.color.tdcoreekyc__white));
        aVar.a();
    }

    public /* synthetic */ MessageHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageHeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.message = "";
        LayoutInflater.from(context).inflate(R.layout.tdcoreekyc__view_message_header, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = findViewById(R.id.top_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f107538a = new a((ConstraintLayout) viewFindViewById, (TextView) viewFindViewById2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g0.f276470a, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                setType(string);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
