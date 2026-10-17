package com.revolut;

import android.R;
import android.app.Activity;
import android.app.ActivityThread;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.signers.PSSSigner;

/* JADX INFO: loaded from: classes.dex */
public class ProtectedRevolutApplication extends Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Object f50262a;

    public class q extends Activity implements View.OnClickListener {

        /* JADX INFO: renamed from: kdi, reason: collision with root package name */
        private static final Pattern f50272kdi = Pattern.compile("^\\s*((\\d+)?\\.?(\\d*)?)\\s*([a-zA-Z]+)?\\s*$");
        private Integer Buoi;
        private int[] Dbw;
        private Float dDy;

        /* JADX INFO: renamed from: dx, reason: collision with root package name */
        private String f50273dx;
        private Uri eHz = null;
        private String iDHo;

        /* JADX INFO: renamed from: ig, reason: collision with root package name */
        private String f50274ig;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f50275j;

        /* JADX INFO: renamed from: la, reason: collision with root package name */
        private String f50276la;

        /* JADX INFO: renamed from: lw, reason: collision with root package name */
        private String f50277lw;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Drawable f50278m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Integer f50279p;
        private Float qqB;

        /* JADX INFO: renamed from: ub, reason: collision with root package name */
        private String f50280ub;
        private int[] wGq;

        /* JADX INFO: renamed from: xq, reason: collision with root package name */
        private int f50281xq;

        public static void AmGi(Context context, String str) {
            Intent intentMa = ma();
            intentMa.putExtra("7f6ac62f231608430ea44623a3ac36d6", 1);
            intentMa.putExtra("e67878b68419331203fbf9e147570515", str);
            context.getApplicationContext().startActivity(intentMa);
        }

        private Integer Cud(String str, String... strArr) {
            try {
                int identifier = getResources().getIdentifier(str, "color", getPackageName());
                if (identifier != 0) {
                    return Integer.valueOf(H(identifier));
                }
                for (String str2 : strArr) {
                    if (!str2.isEmpty()) {
                        return Integer.valueOf(Color.parseColor(str2));
                    }
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        private Float E(String str, String str2) {
            int identifier = getResources().getIdentifier(str, "dimen", getPackageName());
            if (identifier != 0) {
                return Float.valueOf(getResources().getDimension(identifier));
            }
            if (str2 == null || str2.isEmpty()) {
                return null;
            }
            return bli(str2);
        }

        private int[] EEC(String... strArr) {
            String packageName = getPackageName();
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                int identifier = getResources().getIdentifier(str, "color", packageName);
                if (identifier != 0) {
                    arrayList.add(Integer.valueOf(H(identifier)));
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() == 1) {
                arrayList.add((Integer) arrayList.get(0));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Integer) arrayList.get(i)).intValue();
            }
            return iArr;
        }

        private int H(int i) {
            return getResources().getColor(i, getTheme());
        }

        public static boolean aAwE() {
            String strCurrentProcessName = ActivityThread.currentProcessName();
            if (strCurrentProcessName == null) {
                return false;
            }
            return strCurrentProcessName.endsWith(":pebdf87bb099c0923b5b112c8");
        }

        private Float bli(String str) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Matcher matcher = f50272kdi.matcher(str);
            if (!matcher.matches() || matcher.groupCount() < 4 || matcher.group(1) == null) {
                return null;
            }
            float f = Float.parseFloat(matcher.group(1));
            if (matcher.group(4) == null) {
                return Float.valueOf(f);
            }
            String lowerCase = matcher.group(4).toLowerCase();
            lowerCase.hashCode();
            switch (lowerCase) {
                case "in":
                    return Float.valueOf(TypedValue.applyDimension(4, f, displayMetrics));
                case "mm":
                    return Float.valueOf(TypedValue.applyDimension(5, f, displayMetrics));
                case "pt":
                    return Float.valueOf(TypedValue.applyDimension(3, f, displayMetrics));
                case "px":
                    return Float.valueOf(TypedValue.applyDimension(0, f, displayMetrics));
                case "sp":
                    return Float.valueOf(TypedValue.applyDimension(2, f, displayMetrics));
                case "dip":
                    return Float.valueOf(TypedValue.applyDimension(1, f, displayMetrics));
                default:
                    return null;
            }
        }

        private Spanned d(String str) {
            return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 63) : Html.fromHtml(str);
        }

        public static void ez(Context context, int i, String str) {
            Intent intentMa = ma();
            intentMa.putExtra("7ea46f77041f0eca5ef4ca82c6afa300", i);
            intentMa.putExtra("e67878b68419331203fbf9e147570515", str);
            context.startActivity(intentMa);
        }

        private String fqtC(String str, String... strArr) {
            int identifier = getResources().getIdentifier(str, "string", getPackageName());
            if (identifier != 0) {
                return getString(identifier);
            }
            for (String str2 : strArr) {
                if (str2 != null && !str2.isEmpty()) {
                    return str2;
                }
            }
            return "";
        }

        private static int g() {
            return View.generateViewId();
        }

        private int[] loI(String str) {
            if (str != null) {
                try {
                    if (!str.isEmpty()) {
                        String[] strArrSplit = str.split(",");
                        int iMax = Math.max(2, strArrSplit.length);
                        int[] iArr = new int[iMax];
                        for (int i = 0; i < strArrSplit.length; i++) {
                            iArr[i] = Color.parseColor(strArrSplit[i]);
                        }
                        for (int length = strArrSplit.length; length < iMax; length++) {
                            iArr[length] = iArr[0];
                        }
                        return iArr;
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        private static Intent ma() {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.revolut.revolut", "com.revolut.ProtectedRevolutApplication$q"));
            intent.setFlags(268468224);
            return intent;
        }

        private Drawable myy(String... strArr) {
            String packageName = getPackageName();
            for (String str : strArr) {
                int identifier = getResources().getIdentifier(str, "drawable", packageName);
                if (identifier != 0) {
                    return vem(identifier);
                }
                int identifier2 = getResources().getIdentifier(str, "mipmap", packageName);
                if (identifier2 != 0) {
                    return vem(identifier2);
                }
            }
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(BitmapDescriptorFactory.HUE_RED);
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            Drawable drawableLoadIcon = getApplicationInfo().loadIcon(getPackageManager());
            drawableLoadIcon.setColorFilter(colorMatrixColorFilter);
            return drawableLoadIcon;
        }

        private String oj(int i) {
            if (i > 4096) {
                if ((i & 1) != 0) {
                    return this.f50280ub;
                }
                if ((i & 16) != 0) {
                    return this.f50274ig;
                }
                if ((i & 494) != 0) {
                    return this.f50276la;
                }
            }
            return this.f50277lw;
        }

        private String u() {
            ApplicationInfo applicationInfo = getApplicationInfo();
            int i = applicationInfo.labelRes;
            return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : getString(i);
        }

        private void xk() {
            this.f50273dx = fqtC("crash_activity_ok", "", getString(R.string.ok));
            this.f50276la = fqtC("crash_activity_2", "<p style=\"text-align: center\">This app cannot run because the environment is not secure and your data may be at risk.</p>");
            this.f50274ig = fqtC("crash_activity_3", "<p style=\"text-align: center\">This app cannot run because it was not installed from an official platform. Please reinstall from an approved vendor (e.g. Google Play).</p>");
            this.f50280ub = fqtC("crash_activity_4", "<p style=\"text-align: center\">This app cannot be run on an emulator. Please use an official device.</p>");
            this.f50277lw = fqtC("crash_activity_5", "<p style=\"text-align: center\">This app stopped because it is not compatible with your device.<br/>Please try updating the app.</p>");
            this.f50275j = fqtC("crash_activity_6", "<p style=\"text-align: center\">This device does not currently meet the security requirements to use <b>{appName}</b>.</p><br/><p style=\"text-align: center\">Please share the QR code below with our support team.</p>");
            this.iDHo = fqtC("crash_activity_ok_link", "");
            int[] iArrEEC = EEC("crash_activity_btn_color1", "crash_activity_btn_color2");
            this.Dbw = iArrEEC;
            if (iArrEEC == null || iArrEEC.length == 0) {
                this.Dbw = loI("");
            }
            this.f50279p = Cud("crash_activity_btn_text_color", "");
            this.qqB = E("crash_activity_btn_text_size", "");
            int[] iArrEEC2 = EEC("crash_activity_bg_color1", "crash_activity_bg_color2");
            this.wGq = iArrEEC2;
            if (iArrEEC2 == null || iArrEEC2.length == 0) {
                this.wGq = loI("");
            }
            this.Buoi = Cud("crash_activity_text_color", "");
            this.dDy = E("crash_activity_text_size", "");
            this.f50278m = myy("crash_activity_icon", "");
        }

        private void xr(LinearLayout linearLayout) {
            byte[] bArrIxo = ixo();
            if (bArrIxo != null) {
                Bitmap bitmapF = ProtectedRevolutApplication$ProtectedRevolutApplication$q.f(bArrIxo, ProtectedRevolutApplication$ProtectedRevolutApplication$q.qD, true, 256, 256);
                ImageView imageView = new ImageView(this);
                imageView.setImageBitmap(bitmapF);
                imageView.setPadding(20, 20, 20, 20);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                linearLayout.addView(imageView);
            }
        }

        byte[] ixo() {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("e67878b68419331203fbf9e147570515");
            int intExtra = intent.getIntExtra("7ea46f77041f0eca5ef4ca82c6afa300", 0);
            String stringExtra2 = intent.getStringExtra("73b4912190170071abde5c1d34546d7e");
            String str = "";
            if (stringExtra != null) {
                str = "" + stringExtra;
            }
            if (intExtra != 0) {
                str = str + "\n" + intExtra;
            }
            if (stringExtra2 != null) {
                str = str + "\n" + stringExtra2;
            }
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return null;
            }
            return strTrim.getBytes(StandardCharsets.UTF_8);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.eHz != null) {
                startActivity(Intent.createChooser(new Intent("android.intent.action.VIEW", this.eHz), null));
            } else {
                finish();
            }
        }

        @Override // android.app.Activity
        protected void onCreate(Bundle bundle) {
            GradientDrawable gradientDrawable;
            super.onCreate(bundle);
            setTheme(R.style.Theme.Light);
            xk();
            RelativeLayout relativeLayout = new RelativeLayout(this);
            int[] iArr = this.wGq;
            if (iArr != null && iArr.length > 0) {
                relativeLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, this.wGq));
            }
            relativeLayout.setGravity(17);
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            ScrollView scrollView = new ScrollView(this);
            ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            ImageView imageView = new ImageView(this);
            imageView.setId(g());
            imageView.setImageDrawable(this.f50278m);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            TextView textView = new TextView(this);
            textView.setPadding(24, 24, 24, 24);
            textView.setId(g());
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            String str = this.iDHo;
            if (str != null && !str.isEmpty()) {
                this.eHz = Uri.parse(this.iDHo);
            }
            Intent intent = getIntent();
            if (intent.hasExtra("7f6ac62f231608430ea44623a3ac36d6")) {
                textView.setText(d(this.f50275j.replace("{appName}", u())));
            } else if (intent.hasExtra("7ea46f77041f0eca5ef4ca82c6afa300")) {
                textView.setText(d(oj(intent.getIntExtra("7ea46f77041f0eca5ef4ca82c6afa300", 0))));
            }
            Float f = this.dDy;
            if (f != null) {
                textView.setTextSize(0, f.floatValue());
            }
            Integer num = this.Buoi;
            if (num != null) {
                textView.setTextColor(num.intValue());
            }
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(1);
            int[] iArr2 = this.Dbw;
            boolean z = iArr2 != null && iArr2.length > 0;
            if (z) {
                gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, this.Dbw);
                gradientDrawable.setCornerRadius(18.0f);
            } else {
                gradientDrawable = null;
            }
            Button button = new Button(this);
            int iG = g();
            this.f50281xq = iG;
            button.setId(iG);
            button.setText(d(this.f50273dx));
            button.setOnClickListener(this);
            if (z) {
                button.setBackground(gradientDrawable);
                button.setPadding(30, 10, 30, 10);
            }
            Float f4 = this.qqB;
            if (f4 != null) {
                button.setTextSize(0, f4.floatValue());
            }
            Integer num2 = this.f50279p;
            if (num2 != null) {
                button.setTextColor(num2.intValue());
            }
            linearLayout2.addView(button);
            linearLayout.addView(imageView);
            linearLayout.addView(textView);
            linearLayout.addView(linearLayout2);
            xr(linearLayout);
            scrollView.addView(linearLayout, layoutParams3);
            relativeLayout.addView(scrollView, layoutParams2);
            addContentView(relativeLayout, layoutParams);
        }

        Drawable vem(int i) {
            return getResources().getDrawable(i, getTheme());
        }
    }

    public ProtectedRevolutApplication() {
        f50262a = this;
    }

    public static native InputStream a(Object obj2, String str);

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = {115, 99, 55, 38, 43, 51, 114, ISO7816.INS_DECREASE_STAMPED, Ascii.DC4, ISO7816.INS_READ_RECORD_STAMPED, -119, 89, PSSSigner.TRAILER_IMPLICIT, 93, 91, -7, 106, ISO7816.INS_READ_BINARY2, 72, ISO7816.INS_GET_RESPONSE, 82, 84, ISO7816.INS_READ_BINARY, -67, ISO7816.INS_GET_RESPONSE, -101, ISO7816.INS_APPEND_RECORD, 118, ISOFileInfo.ENV_TEMP_EF, -31, -108, Ascii.ETB, ISO7816.INS_READ_BINARY_STAMPED, 118, 28, 74, -21, -72, 119, -34, -89, -99, 107, ISO7816.INS_LOAD_KEY_FILE, ISO7816.INS_READ_RECORD_STAMPED, -15, 105, -70, -83, -19, -128, -23, -51, 86, -69, 6, 76, 30, Constants.NFC_READER, -63, 84, -53, 16, 30, 10, 54, 30, Ascii.ESC, 73, -16, Ascii.NAK, ISO7816.INS_READ_RECORD_STAMPED, 122, 35, 10, -60, -60, -87, -103, ISO7816.INS_MANAGE_CHANNEL, -98, 103, 35, ISOFileInfo.FCP_BYTE, 73, -50, 78, Ascii.ETB, ISO7816.INS_WRITE_BINARY, -53, 107, -88, ISOFileInfo.SECURITY_ATTR_EXP, -100, -105, 99, 93, Ascii.ETB, 108, -45, 45, -50, -67, -98, -21, 78, 62, -75, -43, 53, PSSSigner.TRAILER_IMPLICIT, 28, 80, 75, -71, -9, -18, -97, ISOFileInfo.FMD_BYTE, 11, -43, 72, ISOFileInfo.A1, Ascii.CAN, -19, -120, -122, -112, -43, -6, 102, -128, ISOFileInfo.AB, 57, 7, 93, -19, -94, -83, 47, -26, 61, 116, Ascii.DC4, ISO7816.INS_REHABILITATE_CHV, -53, ISOFileInfo.SECURITY_ATTR_COMPACT, 4, -2, ISO7816.INS_INCREASE, 121, 87, 86, -33, -101, -65, -78, 60, -120, ISO7816.INS_LOAD_KEY_FILE, -120, 124, ISOFileInfo.FMD_BYTE, 83, 83, Ascii.NAK, -90, 0, 14, -29, 95, ISO7816.INS_READ_BINARY_STAMPED, 95, -93, -100, Constants.INQUIRY, 113, 10, ISO7816.INS_UPDATE_BINARY, 96, -51, 82, 86, Ascii.CAN, 18, -18, -9, 57, ISO7816.INS_GET_RESPONSE, -100, 46, 84, -50, -8, 72, -39, -70, 72, ISO7816.INS_READ_BINARY, 37, -90, -16, -128, -7, 4, ISO7816.INS_DECREASE_STAMPED, -87, 90, -34, -4, -52, 114, ISOFileInfo.SECURITY_ATTR_EXP, 110, -119, 43, 79, 29, PSSSigner.TRAILER_IMPLICIT, 85, 86, -90, 57, -60, 124, -120, 104, -22, 58, ISOFileInfo.FCI_BYTE, ISO7816.INS_READ_RECORD2, 5, -50, ISOFileInfo.DATA_BYTES2, 92, -87, Ascii.US, 110, ISO7816.INS_DECREASE_STAMPED, -119, ISO7816.INS_UPDATE_RECORD, -17, -87, 122, -47, 4, -49, -53, ISO7816.INS_PSO, 96, 77, 87, -4, -108, 54, 58};
        byte[] bArr3 = {30, 3, -82, -71, Ascii.DEL, -10, -59, 85, 81, 19, ISO7816.INS_DELETE_FILE, -18, PSSSigner.TRAILER_IMPLICIT, 12, -97, -110, -92, -19, ISOFileInfo.A5, -9, Ascii.DC4, ISO7816.INS_DECREASE, -128, -104, 106, -19, -34, -119, -31, 54, 17, -17, 12, -98, -59, 83, -2, -49, ISOFileInfo.FCP_BYTE, 16, ISO7816.INS_APPEND_RECORD, -13, -124, ISOFileInfo.FILE_IDENTIFIER, 70, 35, 121, 28, ISO7816.INS_APPEND_RECORD, 120, ISO7816.INS_REHABILITATE_CHV, -53, 62, 93, 108, 8, -126, -111, -26, -51, 113, 18, -56, -98, -4, -34, -66, 86, 94, 72, ISO7816.INS_INCREASE, -17, -60, 58, 125, 40, 76, 89, Constants.NFC_READER, ISO7816.INS_READ_BINARY, -65, 32, -104, -52, ISO7816.INS_WRITE_RECORD, -51, -63, -61, 77, -126, -78, Ascii.ETB, ISOFileInfo.SECURITY_ATTR_EXP, -5, ISO7816.INS_GET_DATA, 4, -66, 39, -73, 72, ISO7816.INS_READ_BINARY, -11, -67, ISO7816.INS_DELETE_FILE, -90, 51, 78, 124, Ascii.CAN, -43, 45, -109, -20, ISO7816.INS_INCREASE, 13, -47, 101, -61, 30, 81, -88, Ascii.US, -22, -6, 57, ISOFileInfo.FCI_BYTE, ISO7816.INS_CHANGE_CHV, -113, -47, Ascii.US, 51, 14, 106, 81, ISO7816.INS_APPEND_RECORD, Ascii.SUB, -27, -13, -66, Ascii.SUB, -16, ISO7816.INS_READ_BINARY2, -13, 17, -86, -65, 35, -12, -49, -99, -102, 69, ISO7816.INS_READ_BINARY2, 73, 47, 82, 4, -29, -67, 84, ISO7816.INS_REHABILITATE_CHV, 41, -111, -111, -19, -53, 39, 45, -7, -23, ISOFileInfo.A1, 115, 78, ISO7816.INS_PUT_DATA, -29, -99, 19, 51, 104, Ascii.ESC, -65, -113, ISOFileInfo.FCP_BYTE, -8, ISOFileInfo.PROP_INFO, ISO7816.INS_LOAD_KEY_FILE, -59, 43, ISO7816.INS_READ_BINARY2, -66, -94, Ascii.SUB, -13, 4, ISO7816.INS_REHABILITATE_CHV, ISO7816.INS_LOAD_KEY_FILE, 73, -99, 61, -19, -86, -18, -124, Ascii.CAN, 40, -3, ISO7816.INS_CREATE_FILE, 97, 3, -122, 103, 102, 16, 124, 4, -102, 77, 120, -104, -14, -83, 97, 116, -3, -97, -56, 61, 61, 76, 39, -5, -90, -17, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_READ_RECORD2, -67, 101, 69, ISOFileInfo.FILE_IDENTIFIER, -19, -97, ISOFileInfo.AB, -82, -67, Ascii.ESC, -63, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_COMPACT, -43, 91, -84, 40, -110, -14, ISO7816.INS_PUT_DATA, ISO7816.INS_DELETE_FILE};
        byte[] bArr4 = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr4[i] = bArr2[bArr3[bArr[i] & UnsignedBytes.MAX_VALUE] & UnsignedBytes.MAX_VALUE];
        }
        return bArr4;
    }

    private static native void c();

    public static native String s(String str);

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$RevolutApplication.a(this);
        if (q.aAwE()) {
            return;
        }
        try {
            System.loadLibrary("dexprotector");
        } catch (Throwable th10) {
            ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$q.a(th10);
            throw th10;
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$RevolutApplication.c(this);
        if (q.aAwE()) {
            return;
        }
        try {
            c();
        } catch (Throwable th10) {
            ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$q.a(th10);
            throw th10;
        }
    }
}
