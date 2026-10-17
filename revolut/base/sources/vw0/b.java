package vw0;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends Resources {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f292609a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Resources delegate) {
        super(delegate.getAssets(), delegate.getDisplayMetrics(), delegate.getConfiguration());
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f292609a = delegate;
    }

    @Override // android.content.res.Resources
    public final void addLoaders(ResourcesLoader... loaders) {
        Intrinsics.checkNotNullParameter(loaders, "loaders");
        this.f292609a.addLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getAnimation(int i) {
        XmlResourceParser animation = this.f292609a.getAnimation(i);
        Intrinsics.checkNotNullExpressionValue(animation, "getAnimation(...)");
        return animation;
    }

    @Override // android.content.res.Resources
    public final boolean getBoolean(int i) {
        return this.f292609a.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public final int getColor(int i) {
        return this.f292609a.getColor(i);
    }

    @Override // android.content.res.Resources
    public final ColorStateList getColorStateList(int i) {
        ColorStateList colorStateList = this.f292609a.getColorStateList(i);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "getColorStateList(...)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    public final Configuration getConfiguration() {
        Configuration configuration = this.f292609a.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
        return configuration;
    }

    @Override // android.content.res.Resources
    public final float getDimension(int i) {
        return this.f292609a.getDimension(i);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelOffset(int i) {
        return this.f292609a.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelSize(int i) {
        return this.f292609a.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public final DisplayMetrics getDisplayMetrics() {
        DisplayMetrics displayMetrics = this.f292609a.getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        return displayMetrics;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i) {
        Drawable drawable = this.f292609a.getDrawable(a.a(i));
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        return drawable;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i2) {
        return this.f292609a.getDrawableForDensity(a.a(i), i2);
    }

    @Override // android.content.res.Resources
    public final float getFloat(int i) {
        return this.f292609a.getFloat(i);
    }

    @Override // android.content.res.Resources
    public final Typeface getFont(int i) {
        Typeface font = this.f292609a.getFont(i);
        Intrinsics.checkNotNullExpressionValue(font, "getFont(...)");
        return font;
    }

    @Override // android.content.res.Resources
    public final float getFraction(int i, int i2, int i3) {
        return this.f292609a.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public final int getIdentifier(String str, String str2, String str3) {
        return this.f292609a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public final int[] getIntArray(int i) {
        int[] intArray = this.f292609a.getIntArray(i);
        Intrinsics.checkNotNullExpressionValue(intArray, "getIntArray(...)");
        return intArray;
    }

    @Override // android.content.res.Resources
    public final int getInteger(int i) {
        return this.f292609a.getInteger(i);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getLayout(int i) {
        XmlResourceParser layout = this.f292609a.getLayout(i);
        Intrinsics.checkNotNullExpressionValue(layout, "getLayout(...)");
        return layout;
    }

    @Override // android.content.res.Resources
    public final Movie getMovie(int i) {
        Movie movie = this.f292609a.getMovie(i);
        Intrinsics.checkNotNullExpressionValue(movie, "getMovie(...)");
        return movie;
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2) {
        String quantityString = this.f292609a.getQuantityString(i, i2);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    public final CharSequence getQuantityText(int i, int i2) {
        CharSequence quantityText = this.f292609a.getQuantityText(i, i2);
        Intrinsics.checkNotNullExpressionValue(quantityText, "getQuantityText(...)");
        return quantityText;
    }

    @Override // android.content.res.Resources
    public final String getResourceEntryName(int i) {
        String resourceEntryName = this.f292609a.getResourceEntryName(i);
        Intrinsics.checkNotNullExpressionValue(resourceEntryName, "getResourceEntryName(...)");
        return resourceEntryName;
    }

    @Override // android.content.res.Resources
    public final String getResourceName(int i) {
        String resourceName = this.f292609a.getResourceName(i);
        Intrinsics.checkNotNullExpressionValue(resourceName, "getResourceName(...)");
        return resourceName;
    }

    @Override // android.content.res.Resources
    public final String getResourcePackageName(int i) {
        String resourcePackageName = this.f292609a.getResourcePackageName(i);
        Intrinsics.checkNotNullExpressionValue(resourcePackageName, "getResourcePackageName(...)");
        return resourcePackageName;
    }

    @Override // android.content.res.Resources
    public final String getResourceTypeName(int i) {
        String resourceTypeName = this.f292609a.getResourceTypeName(i);
        Intrinsics.checkNotNullExpressionValue(resourceTypeName, "getResourceTypeName(...)");
        return resourceTypeName;
    }

    @Override // android.content.res.Resources
    public final String getString(int i) {
        String string = this.f292609a.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // android.content.res.Resources
    public final String[] getStringArray(int i) {
        String[] stringArray = this.f292609a.getStringArray(i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        return stringArray;
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i) {
        CharSequence text = this.f292609a.getText(i);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    @Override // android.content.res.Resources
    public final CharSequence[] getTextArray(int i) {
        CharSequence[] textArray = this.f292609a.getTextArray(i);
        Intrinsics.checkNotNullExpressionValue(textArray, "getTextArray(...)");
        return textArray;
    }

    @Override // android.content.res.Resources
    public final void getValue(int i, TypedValue typedValue, boolean z) {
        this.f292609a.getValue(a.a(i), typedValue, z);
    }

    @Override // android.content.res.Resources
    public final void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.f292609a.getValueForDensity(a.a(i), i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getXml(int i) {
        XmlResourceParser xml2 = this.f292609a.getXml(a.a(i));
        Intrinsics.checkNotNullExpressionValue(xml2, "getXml(...)");
        return xml2;
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainAttributes = this.f292609a.obtainAttributes(attributeSet, iArr);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
        return typedArrayObtainAttributes;
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainTypedArray(int i) {
        TypedArray typedArrayObtainTypedArray = this.f292609a.obtainTypedArray(i);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "obtainTypedArray(...)");
        return typedArrayObtainTypedArray;
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i) {
        InputStream inputStreamOpenRawResource = this.f292609a.openRawResource(i);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }

    @Override // android.content.res.Resources
    public final AssetFileDescriptor openRawResourceFd(int i) {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f292609a.openRawResourceFd(i);
        Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenRawResourceFd, "openRawResourceFd(...)");
        return assetFileDescriptorOpenRawResourceFd;
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f292609a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f292609a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public final void removeLoaders(ResourcesLoader... loaders) {
        Intrinsics.checkNotNullParameter(loaders, "loaders");
        this.f292609a.removeLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        this.f292609a.updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.res.Resources
    public final int getColor(int i, Resources.Theme theme) {
        return this.f292609a.getColor(i, theme);
    }

    @Override // android.content.res.Resources
    public final ColorStateList getColorStateList(int i, Resources.Theme theme) {
        ColorStateList colorStateList = this.f292609a.getColorStateList(i, theme);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "getColorStateList(...)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i, Resources.Theme theme) {
        Drawable drawable = this.f292609a.getDrawable(a.a(i), theme);
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        return drawable;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.f292609a.getDrawableForDensity(a.a(i), i2, theme);
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String quantityString = this.f292609a.getQuantityString(i, i2, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    public final String getString(int i, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String string = this.f292609a.getString(i, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i, CharSequence charSequence) {
        CharSequence text = this.f292609a.getText(i, charSequence);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    @Override // android.content.res.Resources
    public final void getValue(String str, TypedValue typedValue, boolean z) {
        this.f292609a.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i, TypedValue typedValue) {
        InputStream inputStreamOpenRawResource = this.f292609a.openRawResource(i, typedValue);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }
}
