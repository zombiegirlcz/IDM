package ch.qos.logback.core.joran.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class ConfigurationWatchListUtil {
    static final ConfigurationWatchListUtil origin = new ConfigurationWatchListUtil();

    private ConfigurationWatchListUtil() {
    }

    public static void addInfo(Context context, String str) {
        addStatus(context, new InfoStatus(str, origin));
    }

    public static void addStatus(Context context, Status status) {
        if (context == null) {
            System.out.println("Null context in ".concat(ConfigurationWatchList.class.getName()));
            return;
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager == null) {
            return;
        }
        statusManager.add(status);
    }

    public static void addToWatchList(Context context, URL url2) {
        ConfigurationWatchList configurationWatchList = getConfigurationWatchList(context);
        if (configurationWatchList == null) {
            addWarn(context, "Null ConfigurationWatchList. Cannot add " + url2);
        } else {
            addInfo(context, "Adding [" + url2 + "] to configuration watch list.");
            configurationWatchList.addToWatchList(url2);
        }
    }

    public static void addWarn(Context context, String str) {
        addStatus(context, new WarnStatus(str, origin));
    }

    public static ConfigurationWatchList getConfigurationWatchList(Context context) {
        if (context == null) {
            return null;
        }
        return (ConfigurationWatchList) context.getObject("CONFIGURATION_WATCH_LIST");
    }

    public static URL getMainWatchURL(Context context) {
        ConfigurationWatchList configurationWatchList = getConfigurationWatchList(context);
        if (configurationWatchList == null) {
            return null;
        }
        return configurationWatchList.getMainURL();
    }

    public static void registerConfigurationWatchList(Context context, ConfigurationWatchList configurationWatchList) {
        context.putObject("CONFIGURATION_WATCH_LIST", configurationWatchList);
    }

    public static void setMainWatchURL(Context context, URL url2) {
        if (context == null) {
            return;
        }
        ConfigurationWatchList configurationWatchList = getConfigurationWatchList(context);
        if (configurationWatchList == null) {
            configurationWatchList = new ConfigurationWatchList();
            configurationWatchList.setContext(context);
            context.putObject("CONFIGURATION_WATCH_LIST", configurationWatchList);
        } else {
            configurationWatchList.clear();
        }
        configurationWatchList.setMainURL(url2);
    }
}
