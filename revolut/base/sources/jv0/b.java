package jv0;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178734a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f178735b;

    public b(Context context) {
        super(context);
        this.f178735b = new b(context, context.getApplicationContext());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        switch (this.f178734a) {
            case 1:
                return (b) this.f178735b;
            default:
                return super.getApplicationContext();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        switch (this.f178734a) {
            case 0:
                return this.f178735b.getResources();
            default:
                return super.getResources();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, Context context2) {
        super(context2);
        this.f178735b = context;
    }
}
